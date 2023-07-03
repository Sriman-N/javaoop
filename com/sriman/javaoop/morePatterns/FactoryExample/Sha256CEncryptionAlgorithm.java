package com.sriman.javaoop.morePatterns.FactoryExample;

public class Sha256CEncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String plaintext) {
        return DigestUtils.sha256Hex(plaintext);
    }
}
