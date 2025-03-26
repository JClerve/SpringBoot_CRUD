package com.example.SpringBoot_CRUD.Controllers;

import com.example.SpringBoot_CRUD.Entity.userEntity;
import com.example.SpringBoot_CRUD.Exception.ResourceNotFoundException;
import com.example.SpringBoot_CRUD.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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


    //create the user
    @PostMapping
    public userEntity createUser(@RequestBody userEntity user){
        return userRepository.save(user);

    }
    //Get the user
    @GetMapping("/{id}")
    public userEntity getUserByID(@PathVariable long id){
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User is not found"));
    }


    //Update the user
    @PutMapping("/{id}")
    public userEntity updateUser(@RequestBody userEntity user,@PathVariable long id){
       userEntity userData = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User is not found"));
        userData.setEmail(user.getEmail());
        userData.setUsername(user.getUsername());
        return userRepository.save(userData);
    }

    //Delete the User
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable long id){
        userEntity userData = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User is not found"));
        userRepository.delete(userData);
        return ResponseEntity.ok().build();

    }


}
