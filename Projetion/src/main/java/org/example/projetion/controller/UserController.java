package org.example.projetion.controller;

import org.example.projetion.model.User;
import org.example.projetion.model.UserEmailOnly;
import org.example.projetion.model.UserNameOnly;
import org.example.projetion.model.UserView;
import org.example.projetion.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Create user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // Get all users (FULL entity)
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Get users older than given age (PROJECTION)
    @GetMapping("/age/{age}")
    public List<UserView> getUsersByAge(@PathVariable int age) {
        return userService.getUsersOlderThan(age);
    }
    @GetMapping("/age/{age}/names")
    public List<UserNameOnly> getUserNames(@PathVariable int age) {
        return userService.getUserNames(age);
    }


    @GetMapping("/age/{age}/emails")
    public List<UserEmailOnly> getUserEmails(@PathVariable int age) {
        return userService.getUserEmails(age);
    }
}
