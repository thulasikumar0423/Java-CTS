package org.example.testingdemo.service;

import org.example.testingdemo.model.User;
import org.example.testingdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id); // NO Optional
    }
}
