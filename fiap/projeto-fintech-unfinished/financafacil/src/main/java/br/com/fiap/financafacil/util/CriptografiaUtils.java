package br.com.fiap.financafacil.util;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

public class CriptografiaUtils {

    public static String criptografar(String senha) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(senha.getBytes(StandardCharsets.UTF_8));
        byte[] hashBytes = md.digest();
        StringBuilder hexString = new StringBuilder();

        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0'); 
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static boolean verificarSenha(String senha, String senhaHash) throws NoSuchAlgorithmException {
        return criptografar(senha).equals(senhaHash);
    }
}
