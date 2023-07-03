package com.sriman.javaoop.morePatterns.FactoryExample;

import java.io.*;

public abstract class Encryptor {
    public void writeToDisk(String plaintext, String filename) {
        EncryptionAlgorithm encryptionAlgorithm = getEncryptionAlgorithm();
        String cyphertext = encryptionAlgorithm.encrypt(plaintext);
        try (FileOutputStream outputStream = new FileOutputStream(filename)) {
            outputStream.write(cyphertext.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract EncryptionAlgorithm getEncryptionAlgorithm();
}
