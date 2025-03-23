package com.example.SpringBoot_CRUD.Controllers;

import com.example.SpringBoot_CRUD.Entity.userEntity;
import com.example.SpringBoot_CRUD.Exception.ResourceNotFoundException;
import com.example.SpringBoot_CRUD.Models.userModel;
import com.example.SpringBoot_CRUD.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public userEntity createUser(@RequestBody userEntity user){
        return userRepository.save(user);

    }

    @GetMapping("/{id}")
    public userEntity getUserByID(@PathVariable long id){
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User is not found"));
    }
}
