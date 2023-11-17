package com.lucasxavier.springbootmongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.lucasxavier.springbootmongo.entities.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String Text);
	
	List<Post> findByTitleContainingIgnoreCase(String text);

}
