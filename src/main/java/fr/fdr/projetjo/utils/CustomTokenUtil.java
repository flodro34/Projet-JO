package fr.fdr.projetjo.utils;

import java.security.SecureRandom;
import java.util.Base64;

public class CustomTokenUtil {

    private static final SecureRandom secureRandom = new SecureRandom(); // threadsafe
    private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder(); // threadsafe

    public static String generateCustomToken() {
        byte[] randomBytes = new byte[15]; // 15 bytes will be 20 characters in base64
        secureRandom.nextBytes(randomBytes);
        return base64Encoder.encodeToString(randomBytes).substring(0, 20); // Ensure the token is 20 characters long
    }

    public static void main(String[] args) {
        // Test the token generation
        System.out.println(generateCustomToken());
    }
}
