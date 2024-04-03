/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;

/**
 *
 * @author rosie
 */
public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String pw;
    private String email;
    private static final String DELIMETER = "-";
    //private String encryptedPw;
    
    public User(String firstName, String lastName, String username, String pw, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.pw = pw;
        this.email = email;           
    }
    
    public User(String[] userArray){
        //each var is set to each item in this array
        this.firstName = userArray[0];
        this.lastName = userArray[1];
        this.username = userArray[2];
        this.pw = userArray[3];
        this.email = userArray[4];
    }
    
    //override toString method
    @Override
    public String toString(){
        return this.firstName + DELIMETER + this.lastName + DELIMETER + this.username + DELIMETER + this.pw + DELIMETER + this.email;
    }

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
     * @param password the password to set
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
