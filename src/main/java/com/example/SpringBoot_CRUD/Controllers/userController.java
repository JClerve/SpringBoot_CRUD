package com.example.SpringBoot_CRUD.Controllers;

import com.example.SpringBoot_CRUD.Models.userModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class userController {

//    @GetMapping
//    public String getUsers(){
//        return "Hello World";
//    }

    @GetMapping
    public List<userModel> getUsers(){
        return Arrays.asList(new userModel());
    }
}
