package com.example.meta.meta_test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.meta.meta_test.Model.Post;
import com.example.meta.meta_test.Repository.MetaPostRepository;


import java.util.List;


@Controller
public class PostController {
    @Autowired
    MetaPostRepository metapRepository;

    
    @GetMapping("/Post")
    public List<Post> index(){
        return metapRepository.findAll();
    }

    @GetMapping("/Post")
    public List<Post> getAll(){
        return (List<Post>) metapRepository.findAll();
    }    
   

    @GetMapping(path = {"/Post?{id}"})
    public ResponseEntity findById(@PathVariable long id){
        return metapRepository.findById(id)
           .map(record -> ResponseEntity.ok().body(record))
           .orElse(ResponseEntity.notFound().build());
    }   

    @PostMapping
        public Post create(@RequestBody Post user){
        return metapRepository.save(user);
    }

    

    public void delete(Post user){
        metapRepository.delete(user);
    }

    
}
