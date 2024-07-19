package com.job.joblisting.controllers;


import com.job.joblisting.models.Post;
import com.job.joblisting.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;


    //fetch all jobs
    @GetMapping("/posts")
    public List<Post> getAllPost(){
     return repo.findAll();
    }

    //posting job
    public Post addPost(@RequestBody Post post) {
        return repo.save(post);
    }

}
