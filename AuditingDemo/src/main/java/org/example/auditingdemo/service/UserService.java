package org.example.auditingdemo.service;

import org.example.auditingdemo.model.User;
import org.example.auditingdemo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }
    public User updateUser(Long id, User user){
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        existingUser.setName(user.getName());

        return userRepository.save(existingUser);
    }
}
