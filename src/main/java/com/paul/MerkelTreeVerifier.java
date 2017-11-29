package com.paul;

import java.util.ArrayList;

public class MerkelTreeVerifier {

  private byte[] dataBlock;
  private ArrayList<Byte[]> hashes = new ArrayList<>();

  public boolean isLegit() {
    HashHandler hashHandler = new HashHandler();

    byte[] dataBlockHash = hashHandler.hash(dataBlock);

    for (int i = 0; i < hashes.size() - 1; i++) {
      dataBlockHash = hashHandler.hash(mergeByteArrays(toByteArray(hashes.get(i)), dataBlockHash));
    }

    return equalArrays(dataBlockHash, toByteArray(hashes.get(hashes.size() - 1)));
  }

  public void addDataBlock(byte[] dataBlock) {
    this.dataBlock = dataBlock;
  }

  public boolean dataBlockSet() {
    return dataBlock != null;
  }

  public void addHash(byte[] hash) {
    hashes.add(toByteObjectArray(hash));
  }

  private boolean equalArrays(byte[] one, byte[] two) {
    if (one.length == two.length) {
      for (int i = 0; i < one.length; i++) {
        if (one[i] != two[i]) {
          return false;
        }
      }
    } else {
      return false;
    }

    return true;
  }

  private byte[] mergeByteArrays(byte[] one, byte[] two) {
//    byte[] byteArray = new byte[one.length + two.length];
//
//    for (int i = 0; i < one.length; i++) {
//      byteArray[i] = one[i];
//    }
//
//    for (int i = 0; i < two.length; i++) {
//      byteArray[i] = two[i];
//    }

    byte[] byteArray = new byte[one.length];

    for (int i = 0; i < one.length; i++) {
      byteArray[i] = new Integer(one[i]^two[i]).byteValue();
    }

    return byteArray;
  }

  private Byte[] toByteObjectArray(byte[] bytes) {
    Byte[] byteObjectArray = new Byte[bytes.length];

    for (int i = 0; i < bytes.length; i++) {
      byteObjectArray[i] = bytes[i];
    }

    return byteObjectArray;
  }

  private byte[] toByteArray(Byte[] bytes) {
    byte[] byteArray = new byte[bytes.length];

    for (int i = 0; i < bytes.length; i++) {
      byteArray[i] = bytes[i];
    }

    return byteArray;
  }
}
