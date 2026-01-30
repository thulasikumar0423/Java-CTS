package org.example.auditingdemo.controller;


import org.example.auditingdemo.model.User;
import org.example.auditingdemo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);

    }
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user){
        return userService.updateUser(id, user);
    }



}
