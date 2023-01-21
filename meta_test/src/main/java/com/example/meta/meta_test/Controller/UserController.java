package com.example.meta.meta_test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.meta.meta_test.Model.User;
import com.example.meta.meta_test.Repository.MetaUserRepository;

@Controller
public class UserController {

    @Autowired
    MetaUserRepository metaRepository;

    @GetMapping("/User")
    public List<User> getAll(){
        return (List<User>) metaRepository.findAll();
    }  
    
   

    @GetMapping(path = {"/User?{id}"})
    public ResponseEntity findById(@PathVariable long id){
        return metaRepository.findById(id)
           .map(record -> ResponseEntity.ok().body(record))
           .orElse(ResponseEntity.notFound().build());
    }

    

    @PostMapping
        public User create(@RequestBody User user){
        return metaRepository.save(user);
    }

    

    public void delete(User user){
        metaRepository.delete(user);
    }

   
}
