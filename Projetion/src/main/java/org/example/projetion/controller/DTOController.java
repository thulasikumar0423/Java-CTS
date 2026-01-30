package org.example.projetion.controller;

import org.example.projetion.dto.UserDTO;
import org.example.projetion.model.User;
import org.example.projetion.service.DTOService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dto/users")
public class DTOController {

    private final DTOService dtoService;

    public DTOController(DTOService dtoService) {
        this.dtoService = dtoService;
    }

    // Create User
    @PostMapping
    public User createUser(@RequestBody User user) {
        return dtoService.saveUser(user);
    }

    // Fetch DTOs
    @GetMapping
    public List<UserDTO> getUserDTOs() {
        return dtoService.getUserDTOs();
    }
}
