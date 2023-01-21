package com.example.meta.meta_test.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.meta.meta_test.Model.User;


@Repository
public interface MetaUserRepository extends CrudRepository<User, Long>{

    List<User> findByName(String name);
    
} 


