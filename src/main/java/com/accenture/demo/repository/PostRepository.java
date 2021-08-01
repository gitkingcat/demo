package com.accenture.demo.repository;

import com.accenture.demo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {


    List<Post> getAllPosts();
}
