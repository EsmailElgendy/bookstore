package org.example.model.users;

import java.time.LocalDate;

public abstract class User {
    private String username;
    private String password;
    private String name;
    private String email;
    private int phoneNumber;
    private LocalDate birthDay;
    public User(String name, int phoneNumber, LocalDate birthDay, String username, String email) {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setBirthDay(birthDay);
        this.setUsername(username);
        this.setEmail(email);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public LocalDate getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
