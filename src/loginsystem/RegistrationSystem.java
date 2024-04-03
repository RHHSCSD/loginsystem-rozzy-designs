/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rosie
 */
public class RegistrationSystem {

    private int userNum;
    private ArrayList<User> userList = new ArrayList();
    private static final String DELIMETER = "-";
    private ArrayList<String> fileInput = new ArrayList();
    private static final String FILE_NAME = "userFile.txt";
    private static File userFile = new File("userFile.txt");
    private ArrayList<String> badPasswordList = new ArrayList();

//    public RegistrationSystem(int userNum){
//        this.userNum = userNum;
//    }
    //------------------------------------------------------------------------------------
    //METHODS
//    
//    public void saveUsers(boolean append){
//        //for each user in USERS, print to file (using toString() method)
//        
//        //appending will add things to the very end
//        //if you want to rewrite the entire thing, it will not be append, it will overwrite
//    }
    
    public void loadBadPasswords(ArrayList <String> badPasswordList){
        try{
            Scanner keyboard = new Scanner(new File("dictbadpass.txt"));
            while(keyboard.hasNextLine()){
                badPasswordList.add(keyboard.nextLine());
            }
            keyboard.close();
        } catch(FileNotFoundException ex){
            System.out.println("File is not found");
        }
    }
    
    public boolean isStrongPassword(String pw) {
        final int MIN_LENGTH = 12;
        final String SPACE = " ";
        int upperLetters = 0;
        int lowerLetters = 0;
        int digits = 0;
        int specialSymbols = 0;
        //BASE CASE: false if...
        //password is found in badPasswordList
        //less than min length
        //has a space or delimeter
        if (badPasswordList.contains(pw) || pw.length() >= MIN_LENGTH || pw.contains(SPACE) || pw.contains(DELIMETER)) {
            return false;
        }

        //loop through each char, count #upperletters, #lowerletters, #nums, #symbols
        for (int i = 0; i < pw.length(); i++) {
            char c = pw.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    upperLetters += 1;
                } else {
                    lowerLetters += 1;
                }
            } else if (Character.isDigit(c)) {
                digits += 1;
            } else {
                specialSymbols += 1;
            }
        }
        //has at least (2) uppercase letters
        //has at least (1) lowercase letter
        //has at least (1) number
        //has at least (1) symbol
        //DOES NOT HAVE A DELIMETER IN IT
        if ((upperLetters >= 2) && (lowerLetters >= 2)){
            if ((digits >= 1) && (specialSymbols >= 1)){
                return true;
            }
        }
        //return false otherwise
        return false;
    }

    public void loadUsers() {
        Scanner keyboard;
        String line;
        try {
            keyboard = new Scanner(userFile);
            while (keyboard.hasNextLine()) {
                //users.add New User(fs.nextLine().split(DELIMETER))
                line = keyboard.nextLine();
                User newUser = new User(line.split(DELIMETER));
                userList.add(newUser);
            }
            keyboard.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RegistrationSystem.class.getName()).log(Level.SEVERE, null, ex);
            //print error message
        }
    }

    public boolean isUniqueName(String username) {
        //if userlist is empty, load it up

        //check each stored username 
        for (User user : userList) {
            //return false if username already exists
            if ((user.getUsername()).equals(username)) {
                return false;
            }
        }
        //true if the username is unique
        return true;

    }

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
}
