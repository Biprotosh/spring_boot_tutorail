package com.springboottutorial.model;

public class User {
    private String name;
    private String email;
    private String mobileNO;
    private int id;

    public User(String name, String email, String mobileNO, int id) {
        this.name = name;
        this.email = email;
        this.mobileNO = mobileNO;
        this.id = id;
    }

    public String getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(String mobileNO) {
        this.mobileNO = mobileNO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
