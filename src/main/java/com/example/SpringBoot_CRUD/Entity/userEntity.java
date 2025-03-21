package com.example.SpringBoot_CRUD.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class userEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
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
