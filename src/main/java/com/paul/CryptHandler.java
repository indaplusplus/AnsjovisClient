package com.paul;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;

public class CryptHandler {

  private PublicKey publicKey;

  public CryptHandler(byte[] key) {
    try {
      KeyFactory keyGen = KeyFactory.getInstance("RSA");
      X509EncodedKeySpec keySpec = new X509EncodedKeySpec(key);
      publicKey = keyGen.generatePublic(keySpec);
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    } catch (InvalidKeySpecException e) {
      e.printStackTrace();
    }
  }

  public byte[] encrypt(String message) {
    byte[] cipherText = null;

    try {
      final Cipher cipher = Cipher.getInstance("RSA");
      cipher.init(Cipher.ENCRYPT_MODE, publicKey);
      cipherText = cipher.doFinal(message.getBytes());
    } catch (Exception e) {
      e.printStackTrace();
    }

    return cipherText;
  }
}
