package com.job.joblisting.controllers;


import com.job.joblisting.models.Post;
import com.job.joblisting.repositories.PostRepository;
import com.job.joblisting.repositories.SearchRepository;
import com.job.joblisting.repositories.SearchRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository searchrepo;


    //fetch all jobs
    @GetMapping("/posts")
    public List<Post> getAllPost(){
     return repo.findAll();
    }

    // fetch searched jobs

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return searchrepo.findByText(text);
    }

    //posting job
    @PostMapping("/posts")
    public Post addPost(@RequestBody Post post) {
        return repo.save(post);
    }

}
