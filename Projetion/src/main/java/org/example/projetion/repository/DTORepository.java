package org.example.projetion.repository;

import org.example.projetion.dto.UserDTO;
import org.example.projetion.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DTORepository extends JpaRepository<User, Long> {
    // List<UserView> findByAgeGreaterThan(int aage);

    @Query("SELECT new org.example.projetion.dto.UserDTO(u.name,u.email) FROM User u")
    List<UserDTO> fetchUsers();
}