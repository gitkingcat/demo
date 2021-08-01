package com.accenture.demo.service;

import com.accenture.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private final PostRepository postRepository;


    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
}
