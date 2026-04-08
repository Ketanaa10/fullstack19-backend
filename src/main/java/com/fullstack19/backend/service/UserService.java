
package com.fullstack19.backend.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.fullstack19.backend.model.User;
import com.fullstack19.backend.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User saveUser(User user) {
        return repository.save(user);
    }
}
