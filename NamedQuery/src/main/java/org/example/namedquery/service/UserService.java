package org.example.namedquery.service;

import org.example.namedquery.model.User;
import org.example.namedquery.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository= userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUsersByName(String name) {
        return userRepository.findByName(name);
    }
}
