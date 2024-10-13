package model;

public class Contact {
    private String contactID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;
    private String contactGroup;  // Could be like "Family", "Friends", etc.
    private String userID;        // This will associate the contact with a specific user

    // Constructor
    public Contact(String contactID, String firstName, String lastName, String phoneNumber,
                   String email, String address, String contactGroup, String userID) {
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.contactGroup = contactGroup;
        this.userID = userID;
    }

    // Getters and setters for each attribute
    public String getContactID() {
        return contactID;
    }

    public void setContactID(String contactID) {
        this.contactID = contactID;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return " " +
                
                " " + firstName +
                " \t\t" + lastName +
                " \t" + phoneNumber +
                " \t" + email +
                " \t" + address +
                " \t" + contactGroup;
    }
}

/**
 *
 * @author: < Eurico Dande - 223134902 />
 */