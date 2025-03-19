package com.example.SpringBoot_CRUD.Models;

public class userModel {
    private long id;
    private String username;

    public userModel(long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String email;
}
