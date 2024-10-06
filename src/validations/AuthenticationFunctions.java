package validations;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AuthenticationFunctions {
    public static boolean validateUsername(String username) {
        // Length check
        if (username.length() < 3 || username.length() > 15) {
            JOptionPane.showMessageDialog(null, "Username must be between 3 and 15 characters.", "Invalid range", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    
        // Alphanumeric with underscores or hyphens
        if (!username.matches("[a-zA-Z0-9_\\-]+")) {
            JOptionPane.showMessageDialog(null, "Username can only contain letters, numbers, underscores, or hyphens.", "Invalid characters", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    
        // No spaces
        if (username.contains(" ")) {
            JOptionPane.showMessageDialog(null, "Username cannot contain spaces.", "No spaces allowed", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    
        // First character must be a letter
        if (!Character.isLetter(username.charAt(0))) {
            JOptionPane.showMessageDialog(null, "Username must start with a letter.", "Starting with numbers", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    
        // Reserved words check
        String[] reservedWords = { "admin", "root", "null" };
        for (String word : reservedWords) {
            if (username.toLowerCase().contains(word)) {
                JOptionPane.showMessageDialog(null, "Username cannot contain reserved words like 'admin', 'root', or 'null'.", "Reserved words", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    
        String filePath = "src/storage/user.csv";

        // Username already exists check 
        if (usernameExistsInTheFile(username, filePath)) {
             JOptionPane.showMessageDialog(null, "Username already exists.", "Invalid Username", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    
        // Valid username
        return true;
    }

    public static boolean validateUsernameLogin(String username) {
        // Length check
        if (username.length() < 3 || username.length() > 15) {
            JOptionPane.showMessageDialog(null, "Username must be between 3 and 15 characters.", "Invalid range", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    
        // Alphanumeric with underscores or hyphens
        if (!username.matches("[a-zA-Z0-9_\\-]+")) {
            JOptionPane.showMessageDialog(null, "Username can only contain letters, numbers, underscores, or hyphens.", "Invalid characters", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    
        // No spaces
        if (username.contains(" ")) {
            JOptionPane.showMessageDialog(null, "Username cannot contain spaces.", "No spaces allowed", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    
        // First character must be a letter
        if (!Character.isLetter(username.charAt(0))) {
            JOptionPane.showMessageDialog(null, "Username must start with a letter.", "Starting with numbers", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    
        // Reserved words check
        String[] reservedWords = { "admin", "root", "null" };
        for (String word : reservedWords) {
            if (username.toLowerCase().contains(word)) {
                JOptionPane.showMessageDialog(null, "Username cannot contain reserved words like 'admin', 'root', or 'null'.", "Reserved words", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    
        // Valid username
        return true;
    }
    
    public static boolean usernameExistsInTheFile(String username, String filePath) {
        File file = new File(filePath);

        try {
            Scanner scanner = new Scanner(file);

            // Skip the header
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            // Iterate through each line in the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] userDetails = line.split(",");

                String existingUsername = userDetails[3];  

                // Check if the username matches
                if (existingUsername.equalsIgnoreCase(username)) {
                    scanner.close();
                    return true;  // Username found
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File not found: " + filePath, "Invalid Username", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        return false;  // Username not found
    }

    // Function to validate first name and last name
    public static boolean validateName(String name, String fieldName) {
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, fieldName + " cannot be empty.", "Invalid " + fieldName, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        String nameRegex = "^(?!.*\\s)(!?[A-Z][a-zA-Z]*)$";
        if (!name.matches(nameRegex)) {
            JOptionPane.showMessageDialog(null, "Only letters and '!' are allowed, and it must start with an uppercase letter.", "Invalid " + fieldName, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // Function to validate the password format
    public static boolean validatePasswordFormat(String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"; // Password rules
        if (!password.matches(passwordRegex)) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one uppercase letter, \none number, one special character, and be at least 8 characters long.", "Invalid Password", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // Function to check if the passwords match
    public static boolean validatePasswordMatch(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match.", "Password Mismatch", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // Method to hash the password using SHA-256
    public static String hashPassword(String password) {
        try {
            // Create a MessageDigest instance for SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Convert the password string to a byte array
            byte[] hashedBytes = md.digest(password.getBytes());

            // Convert the hashed byte array to a hex string
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b)); // Format each byte as a 2-digit hex value
            }
            return sb.toString(); // Return the hashed password as a hex string

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing the password", e);
        }
    }
}

/**
 *
 * @author: < Eurico Dande - 223134902 />
 */