package com.example.diesoon;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {

    @Serial
    private  static  final long serialVersionUID = 10L;

    private String firstName;
    private String lastNamee;
    private String phoneNumber;
    private String gender;
    private String userName;
    private String password;


    // SETTERS AND GETTERS

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNamee() {
        return lastNamee;
    }

    public void setLastNamee(String lastNamee) {
        this.lastNamee = lastNamee;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    @Override
    public String toString() {
        return  firstName + "/" + lastNamee + "/"   + phoneNumber + "/"  + gender + "/"   + userName + "/"  + password ;
    }

    public User(String firstName, String lastNamee, String phoneNumber, String userName, String password) {
        this.firstName = firstName;
        this.lastNamee = lastNamee;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.userName = userName;
        this.password = password;
    }
}
