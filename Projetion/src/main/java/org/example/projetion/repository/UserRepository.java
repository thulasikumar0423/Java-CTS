package org.example.projetion.repository;

import org.example.projetion.dto.UserDTO;
import org.example.projetion.model.User;
import org.example.projetion.model.UserView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
   List<UserView> findByAgeGreaterThan(int aage);

//    @Query("SELECT new org.example.projetion.dto.UserDTO(u.name,u.email) FROM User u")
//    List<UserDTO> fetchUsers();
 <T>List<T> findByAgeGreaterThan(int age, Class<T> type);
}