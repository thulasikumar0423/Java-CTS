package org.example.springdatajpa1.service;


import org.example.springdatajpa1.entity.User;
import org.example.springdatajpa1.repository.UserPagingSortingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserPagingSortingRepository repository;


    public User saveUser(User user){
        return repository.save(user);
    }
    public Page<User> findByAgeGreaterThan(int age, Pageable pageable) {
        return repository.findByAgeGreaterThan(age, pageable);
    }

//    public Page<User> findByAgeGreaterThan(int age, int page, int size) {
//        Pageable pageable = PageRequest.of(page, size);
//        return repository.findByAgeGreaterThan(age, pageable);
//    }

    public Iterable<User> findByNameContaining(String name, Sort sort){
     return repository.findByNameContaining(name,sort);
    }

}
