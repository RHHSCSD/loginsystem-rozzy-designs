/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Author: Rosie Chai
 * Program: Login and registration system
 * Date: April 1, 2024
 */
public class User {

    private String firstName;
    private String lastName;
    private String username;
    private String pw;
    private String email;
    private static final String DELIMITER = "~";
    private String salt;

    //------------------------------------------------------------------------------------
    //Constructors

    /**
     *
     * @param firstName
     * @param lastName
     * @param email
     * @param username
     * @param pw
     */
    
    public User(String firstName, String lastName, String email, String username, String pw) {
        this.salt = generateSalt();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.pw = encryptPassword(pw + this.salt);
    }

    /**
     *
     * @param userArray used to initialize all variables
     */
    public User(String[] userArray) {
        this.firstName = userArray[0];
        this.lastName = userArray[1];
        this.email = userArray[2];
        this.username = userArray[3];
        this.pw = userArray[4]; //don't encrypt, b/c in the file, the pw stored is ALREADY encrypted
        this.salt = userArray[5];
    }

    //------------------------------------------------------------------------------------
    //Methods

    /**
     * Separating each instance variable with a delimiter, used when writing to the user file
     * @return String representation of the user object
     */
    @Override
    public String toString() {
        
        return this.firstName + DELIMITER + this.lastName + DELIMITER + this.email + DELIMITER + this.username + DELIMITER + this.pw + DELIMITER + this.salt;
        //note: storing unencrypted salt
    }
    
    /**
     * Randomly generate a sequence of characters/symbols for the unique salt
     * @return randomized salt sequence
     */
    public String generateSalt() {
        //random range: 3-7 chars
        final int MIN = 3;
        final int MAX = 7;
        int randomLength = (int) ((Math.random() * (MAX - MIN)) + MIN);
        String randomSalt = "";
        //generate random# of chars from 0 (48 ascii) --> z (122 ascii)
        for (int i = 0; i < randomLength; i++) {
            int randomChar = (int) ((Math.random() * ('z' - '0')) + '0');
            randomSalt = randomSalt + (char) randomChar;
        }
        return randomSalt;
    }

    /**
     *
     * @param pw String (pw + salt) that is to be encrypted
     * @return the encrypted password
     */
    public String encryptPassword(String pw) {
        String encryptedPassword = "";
        try {
            //java helper class to perform encryption
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            //give the helper function the password
            md.update(pw.getBytes());
            //perform the encryption
            byte byteData[] = md.digest();
            //To express the byte data as a hexadecimal number (the normal way)
            for (int i = 0; i < byteData.length; ++i) {
                encryptedPassword += (Integer.toHexString((byteData[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return encryptedPassword;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(RegistrationSystem.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Verify if entered password matches with the user object's password
     * @param inputPw String entered by the user
     * @return true if both passwords match
     *         false if they don't match
     */
    public boolean passwordsMatch(String inputPw) {
        //encrypt entered password
        String encInputPw = encryptPassword(inputPw + this.salt);
        //check if both pw's equal
        if ((this.pw).equals(encInputPw)) {
            return true;
        } else {
            return false;
        }
    }

    //------------------------------------------------------------------------------------
    //Getters/Setters
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPw() {
        return pw;
    }

    /**
     * @param pw the password to set
     */
    public void setPw(String pw) {
        this.pw = pw;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
