package com.example.SpringBoot_CRUD.Controllers;

import com.example.SpringBoot_CRUD.Entity.userEntity;
import com.example.SpringBoot_CRUD.Models.userModel;
import com.example.SpringBoot_CRUD.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class userController {

    @Autowired
    private userRepository userRepository;

    @GetMapping
    public List<userEntity> getUsers(){
        return userRepository.findAll();
    }
}
