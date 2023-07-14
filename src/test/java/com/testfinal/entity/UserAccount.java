package com.testfinal.entity;

public class UserAccount {
    private String name;
    private String pass;
    private String phone;
    private String email;
    private String retypePass;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRetypePass() {
        return retypePass;
    }

    public void setRetypePass(String retypePass) {
        this.retypePass = retypePass;
    }

    public UserAccount(String name, String pass, String phone, String email, String retypePass) {
        this.name = name;
        this.pass = pass;
        this.phone = phone;
        this.email = email;
        this.retypePass = retypePass;
    }

    public UserAccount(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
