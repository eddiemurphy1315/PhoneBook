package model;

public class User {
    private String userID;
    private String firstName;
    private String lastName;
    private String username;

    // Constructor
    public User(String userID, String firstName, String lastName, String username) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    // Getters and setters for each attribute

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }    
}

/**
 *
 * @author: < Eurico Dande - 223134902 />
 */