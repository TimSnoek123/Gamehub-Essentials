package com.gamehub.essentials.Encryption;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.Base64;

public class ABSEncryption {
    private static final byte[] SALT = {
            (byte) 0xA9, (byte) 0x9B, (byte) 0xC8, (byte) 0x32,
            (byte) 0x56, (byte) 0x35, (byte) 0xE3, (byte) 0x03
    };
    private static final int ITERATION_COUNT = 65536;
    private static final int KEY_LENGTH = 256;
    private Cipher encryptCipher;
    private Cipher decryptCipher;

    public ABSEncryption() throws NoSuchPaddingException, NoSuchAlgorithmException {
        encryptCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        decryptCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    }

    public void setPassPhrase(String passPhrase) throws Exception {
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        KeySpec spec = new PBEKeySpec(passPhrase.toCharArray(), SALT, ITERATION_COUNT, KEY_LENGTH);
        SecretKey tmp = factory.generateSecret(spec);
        SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");

        encryptCipher.init(Cipher.ENCRYPT_MODE, secret);

        byte[] iv = encryptCipher.getParameters().getParameterSpec(IvParameterSpec.class).getIV();
        decryptCipher.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(iv));
    }

    public String encrypt(String encrypt) throws Exception {
        byte[] bytes = encrypt.getBytes("UTF8");
        byte[] encrypted = encrypt(bytes);
        return Base64.getUrlEncoder().encodeToString(encrypted);
    }

    public byte[] encrypt(byte[] plain) throws Exception {
        return encryptCipher.doFinal(plain);
    }

    public String decrypt(String encrypt) throws Exception {
        byte[] bytes = Base64.getUrlDecoder().decode(encrypt);
        byte[] decrypted = decrypt(bytes);
        return new String(decrypted, "UTF8");
    }

    public byte[] decrypt(byte[] encrypt) throws Exception {
        return decryptCipher.doFinal(encrypt);
    }
}
