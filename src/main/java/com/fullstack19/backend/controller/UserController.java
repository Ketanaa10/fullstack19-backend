
package com.fullstack19.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.fullstack19.backend.model.User;
import com.fullstack19.backend.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getUsers() {
        return service.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.saveUser(user);
    }
}
