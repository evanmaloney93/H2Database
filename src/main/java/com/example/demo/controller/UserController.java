package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    private UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PutMapping("/adduser")
    User newEmployee(@RequestBody User newUser) {
        return repository.save(newUser);
    }

    @GetMapping("/getallusers")
    List<User> all() {
        return (List<User>) repository.findAll();
    }

    @PostMapping("/adduser")
    User newUser(@RequestBody User user) {
        return repository.save(user);
    }

    @GetMapping("/users/{id}")
    Optional<User> getOne(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PutMapping("/replaceusers/{id}")
    User replaceEmployee(@RequestBody User newUser, @PathVariable Long id) {

        return repository.findById(id)
                .map(user -> {
                    user.setFirst_name(newUser.getFirst_name());
                    user.setLast_name(newUser.getLast_name());
                    user.setEmail(newUser.getEmail());
                    return repository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return repository.save(newUser);
                });
    }

    @DeleteMapping("/deleteusers/{id}")
    void deleteUsers(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
