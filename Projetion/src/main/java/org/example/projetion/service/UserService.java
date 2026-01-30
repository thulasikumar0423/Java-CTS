package org.example.projetion.service;

import org.example.projetion.model.User;
import org.example.projetion.model.UserEmailOnly;
import org.example.projetion.model.UserNameOnly;
import org.example.projetion.model.UserView;
import org.example.projetion.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Save user (normal entity)
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Get all users (full entity)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get users by age using PROJECTION
    public List<UserView> getUsersOlderThan(int age) {
        return userRepository.findByAgeGreaterThan(age);
    }
    public List<UserNameOnly> getUserNames(int age) {
        return userRepository.findByAgeGreaterThan(age, UserNameOnly.class);
    }
    public List<UserEmailOnly> getUserEmails(int age) {
        return userRepository.findByAgeGreaterThan(age, UserEmailOnly.class);
    }

}
