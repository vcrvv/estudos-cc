package br.com.fiap.financafacil.util;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

public class CriptografiaUtils {

    public static String criptografar(String senha) throws NoSuchAlgorithmException {
        // Obtém a instância do algoritmo SHA-256
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        // Passa os dados a serem criptografados com UTF-8
        md.update(senha.getBytes(StandardCharsets.UTF_8));

        // Gera a chave criptografada em array de Bytes
        byte[] hashBytes = md.digest();

        // Converte os bytes para uma representação hexadecimal
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0'); 
            hexString.append(hex);
        }

        // Retorna a senha criptografada
        return hexString.toString();
    }

    public static boolean verificarSenha(String senha, String senhaHash) throws NoSuchAlgorithmException {
        return criptografar(senha).equals(senhaHash);
    }
}
