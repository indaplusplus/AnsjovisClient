package com.paul;

import com.google.protobuf.ByteString;
import com.google.protobuf.Message;
import com.paul.AnsjovisOuterClass.Ansjovis;
import com.paul.AnsjovisOuterClass.Ansjovis.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;

public class ConnectionHandler extends Thread {

  private File file;
  private Socket socket;

  private CryptHandler cryptHandler;
  private MerkelTreeVerifier merkelTreeVerifier;

  public ConnectionHandler(Socket socket, File file) {
    this.file = file;
    this.socket = socket;

    this.merkelTreeVerifier = new MerkelTreeVerifier();
  }

  @Override
  public void run() {
    try {
      send(Action.HELLO, new byte[] {});
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      while (socket.isConnected()) {
        Ansjovis message = receive();

        System.out.println(message.getAction() + ": " + message.getMessage());

        switch (message.getAction()) {
          case KEY:
            sendFile(message);
            break;
          case END:
            if (message.getMessage().toByteArray().length == 0) {
              System.out.println("Does this check out? " + merkelTreeVerifier.isLegit());
            } else if (merkelTreeVerifier.dataBlockSet()) {
              merkelTreeVerifier.addHash(message.getMessage().toByteArray());
            } else {
              merkelTreeVerifier.addDataBlock(message.getMessage().toByteArray());
            }
            break;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void sendFile(Ansjovis message) throws IOException {
    cryptHandler = new CryptHandler(message.getMessage().toByteArray());

    FileInputStream is = new FileInputStream(file);
    int blockCount = 0;

    while (is.available() > 0 || Math.log(blockCount) / Math.log(2) % 1D != 0D) {
      String bytes = "";
      int character = -1;

      while (bytes.length() < 53 && (character = is.read()) != -1) {
        bytes += (char) character;
      }

      while (bytes.length() < 53) {
        bytes += '\0';
      }

      send(Action.TRANSFER, cryptHandler.encrypt(bytes));
      blockCount++;
    }

    send(Action.END, new byte[] {new Integer(new Random().nextInt(blockCount)).byteValue()});
  }

  public void send(Ansjovis.Action action, byte[] message) throws IOException {
    Ansjovis.Builder builder = Ansjovis.newBuilder();
    builder.setAction(action);
    builder.setMessage(ByteString.copyFrom(message));

    builder.build().writeDelimitedTo(socket.getOutputStream());

    socket.getOutputStream().flush();
  }

  public Ansjovis receive() throws IOException {
    return Ansjovis.parseDelimitedFrom(socket.getInputStream());
  }
}
