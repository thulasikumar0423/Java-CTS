package org.example.testingdemo.repository;

import org.example.testingdemo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    User findById(int id);
}
