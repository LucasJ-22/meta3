package com.example.meta.meta_test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.meta.meta_test.Model.Post;

import java.util.Optional;


public interface MetaPostRepository extends JpaRepository<Post, Integer>{

    Optional<Post> findById(Long id);
} 
