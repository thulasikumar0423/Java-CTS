package org.example.springdatajpa1.repository;

import org.example.springdatajpa1.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserPagingSortingRepository 
        extends PagingAndSortingRepository<User, Long> {
    
    Page<User> findByAgeGreaterThan(int age, Pageable pageable);
    
    Iterable<User>findByNameContaining(String name, Sort sort);

   User save(User user);
}
