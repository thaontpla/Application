package com.testfinal.entity;

public class UserAccount {
    private String name;
    private String email;
    private String phone;
    private String pass;
    private String retypePass;

    public String getName() {
        return name;
    }

    public UserAccount(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public UserAccount(String name, String email, String phone, String pass, String retypePass) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pass = pass;
        this.retypePass = retypePass;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPass() {
        return pass;
    }

    public String getRetypePass() {
        return retypePass;
    }
}
