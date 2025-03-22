package com.example.SpringBoot_CRUD.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class userEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String username;
private String email;

    public userEntity(long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public userEntity() {
    }
}
