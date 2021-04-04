package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    private UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }


    //I AM AN IDIOT WHO DOESN'T UNDERSTAND POST VS PUT AGHHHHHHHHHH
    @PutMapping("/adduser")
    User newEmployee(@RequestBody User newUser) {
        return repository.save(newUser);
    }

    @PostMapping("/user/{id}")
    User updateUser(@RequestBody Long id, User user)
        repo
    }

//    @GetMapping("/testing")
//    public String test(){
//
//        return "Fuck Postman";
//    }
}
