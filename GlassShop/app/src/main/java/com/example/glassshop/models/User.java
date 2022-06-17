package com.example.glassshop.models;

public class User {

    private int id;
    private String email, firstName, lastName, city, address, phoneNumber;

    public User(int id, String email, String firstName, String lastName, String city, String address, String phoneNumber) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFName() {
        return firstName;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getLName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}