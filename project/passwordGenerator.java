package project;


import java.security.SecureRandom;
import java.util.*;

public class passwordGenerator {
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String OTHER_CHAR = "@#*+-";
    private static final String PASSWORD_ALLOW_BASE = CHAR_LOWER + CHAR_UPPER + NUMBER + OTHER_CHAR;
    private static SecureRandom random = new SecureRandom(); // object created random

    public static void main(String[] args) {
        int length = 12; // Length of the generated password
        System.out.println(generatePassword(length));
    }

    public static String generatePassword(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("The length of the password must be at least 1.");
        }

        StringBuilder password = new StringBuilder(length); // object created passowrd
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(PASSWORD_ALLOW_BASE.length());
            password.append(PASSWORD_ALLOW_BASE.charAt(randomIndex));
        }
        return password.toString(); // This line converts the contents of the password StringBuilder to a string and
                                    // returns it as the generated password.

    }

}
