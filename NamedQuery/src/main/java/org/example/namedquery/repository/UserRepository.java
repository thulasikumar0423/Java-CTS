package org.example.namedquery.repository;

import org.example.namedquery.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(name="User.findByName")
    List<User> findByName(@Param("name")String name);

}
