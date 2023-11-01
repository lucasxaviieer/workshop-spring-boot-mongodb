package com.lucasxavier.springbootmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lucasxavier.springbootmongo.entities.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
