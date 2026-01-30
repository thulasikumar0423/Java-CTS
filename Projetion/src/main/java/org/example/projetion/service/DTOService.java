package org.example.projetion.service;

import org.example.projetion.dto.UserDTO;
import org.example.projetion.model.User;
import org.example.projetion.repository.DTORepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DTOService {

    private final DTORepository dtoRepository;

    public DTOService(DTORepository dtoRepository) {
        this.dtoRepository = dtoRepository;
    }

    // Save User entity
    public User saveUser(User user) {
        return dtoRepository.save(user);
    }

    // Fetch users as DTO
    public List<UserDTO> getUserDTOs() {
        return dtoRepository.fetchUsers();
    }
}
