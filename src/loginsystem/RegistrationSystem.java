/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;

import java.io.*;
import java.util.*;

/**
 * Author: Rosie Chai Program: Login and registration system Date: April 1, 2024
 */
public class RegistrationSystem {

    //initialize variables
    private ArrayList<User> userList = new ArrayList();
    private final String DELIMITER = "~";
    private ArrayList<String> badPasswordList = new ArrayList();
    private File userFile = new File("userFile.txt");

    //------------------------------------------------------------------------------------
    //Constructors
    /**
     * Initialize Registration System by loading the list of bad passwords and
     * loading the list of current user login information
     */
    public RegistrationSystem() {
        loadBadPasswords(badPasswordList);
        loadUsers();
    }

    //------------------------------------------------------------------------------------
    //METHODS
    /**
     * Save a new user by appending the user's information to the user file
     *
     * @param newUser, User object that is to be added to the file
     */
    public void saveUser(User newUser){
        try {
            //write to file
            PrintWriter writer = new PrintWriter(new FileWriter(userFile, true));
            writer.print("\n" + newUser); //print not println in case cursor in pre-existing file is not on a new line
            writer.close();
            //add to user arraylist
            userList.add(newUser);
        } catch (java.io.IOException ex) {
            System.out.println("File is not found");
        }
    }

    /**
     * Attempting to create a new User object given parameters that are needed
     *
     * @param firstName
     * @param lastName
     * @param email
     * @param username
     * @param pw
     * @return 0 if success 
     *         -1 if username is taken 
     *         -2 if password doesn't match criteria
     */
    public int register(String firstName, String lastName, String email, String username, String pw) {
        //check if it's a unique username & if it doesn't have a delimiter
        if (isUniqueName(username) && !username.contains(DELIMITER)) {
            //check if it's a strong password
            if (isStrongPassword(pw)) {
                //save user
                User newUser = new User(firstName, lastName, email, username, pw);
                saveUser(newUser);
                return 0;
            } else {
                return -2;
            }
        } else {
            return -1;
        }
    }

    /**
     * Determine if user can login
     *
     * @param username String
     * @param pw String
     * @return true if username & pw are correct false if username/pw are
     * invalid
     */
    public boolean login(String username, String pw) {
        //parse through each user and check if username and password match, if not then return false
        boolean userFound = false; //stop parsing once user is found
        for (int i = 0; i < userList.size() && !userFound; i++) {
            User tempUser = userList.get(i);
            if ((tempUser.getUsername()).equals(username)) {
                userFound = true;
                if ((tempUser.passwordsMatch(pw))) {
                    return true;
                }
            }
        }
        //if user is found AND pw don't match, return false
        //if user is NOT found, return false
        return false;
    }

    /**
     * Load the bad passwords into an arraylist for more efficient searching
     *
     * @param badPasswordList ArrayList that will be loaded
     */
    public void loadBadPasswords(ArrayList<String> badPasswordList) {
        try {
            Scanner keyboard = new Scanner(new File("dictbadpass.txt"));
            while (keyboard.hasNextLine()) {
                badPasswordList.add(keyboard.nextLine());
            }
            keyboard.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found");
        }
    }

    /**
     * Determine if the user entered pw is strong enough based on specified
     * criteria
     *
     * @param pw String that is to be checked
     * @return true if more than 8 chars not found in bad password list has no
     * spaces or delimiters at least 1 upper & lower case letter at least 1
     * digit & 1 special symbol false otherwise
     */
    public boolean isStrongPassword(String pw) {
        final int MIN_LENGTH = 8;
        final String SPACE = " ";
        int upperLetters = 0;
        int lowerLetters = 0;
        int digits = 0;
        int specialSymbols = 0;

        //BASE CASE: false if...
        //password is found in badPasswordList
        //less than min length
        //has a space or delimeter
        if (badPasswordList.contains(pw) || pw.length() < MIN_LENGTH || pw.contains(SPACE) || pw.contains(DELIMITER)) {
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

        //check if has at least (1) uppercase letter
        //                      (1) lowercase letter
        //                      (1) number
        //                      (1) symbol
        //                      DOES NOT HAVE A DELIMITER IN IT
        if ((upperLetters >= 1) && (lowerLetters >= 1)) {
            if ((digits >= 1) && (specialSymbols >= 1)) {
                return true;
            }
        }
        //return false otherwise
        return false;
    }

    /**
     * load all the users from a pre-existing file
     * into an arraylist of users
     */
    public void loadUsers() {
        Scanner keyboard;
        String line;
        try {
            keyboard = new Scanner(userFile);
            while (keyboard.hasNextLine()) {
                line = keyboard.nextLine();
                if (!line.isEmpty()) {
                    User newUser = new User(line.split(DELIMITER));
                    userList.add(newUser);
                }
            }
            keyboard.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(RegistrationSystem.class.getName()).log(Level.SEVERE, null, ex);
            //print error message
            System.out.println("File not found");
        }
    }

    /**
     * check if username entered is unique
     * @param username String that is to be checked
     * @return true if unique
     *         false otherwise
     */
    public boolean isUniqueName(String username) {
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
}
