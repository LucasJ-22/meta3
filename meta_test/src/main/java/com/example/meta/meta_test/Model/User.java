package com.example.meta.meta_test.Model;

import org.springframework.stereotype.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Repository
public class User {
    @Id   
    @GeneratedValue(strategy = GenerationType.IDENTITY)    

    private Long id;

    private String name;
    private String password;

    public User() {  }

    public User(String name, String password ){
        this.setName(name);
        this.setPassword(password);
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString(){
        return "User{" + "id =" + id + "nome =" + name + "}";
    }
}
