package org.example.springdatajpa2.repository;

import org.example.springdatajpa2.mappingEntity.User;
import org.example.springdatajpa2.model.UserView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<UserView> findByAGeGreaterThan(int aage);
}
