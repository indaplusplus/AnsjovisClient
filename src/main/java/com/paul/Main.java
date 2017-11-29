package com.paul;

import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    try {
      Socket socket = new Socket("127.0.0.1", 0xDAD);
      new ConnectionHandler(socket, new File("/home/paul/Downloads/Ansjovis.proto")).start();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
