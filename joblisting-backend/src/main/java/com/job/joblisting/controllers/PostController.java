package com.job.joblisting.controllers;


import com.job.joblisting.models.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    //fetch all jobs
    @GetMapping("/posts")
    public List<Post> getAllPost(){

    }
}
