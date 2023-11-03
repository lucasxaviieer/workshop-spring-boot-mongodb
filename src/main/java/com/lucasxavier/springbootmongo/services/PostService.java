package com.lucasxavier.springbootmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasxavier.springbootmongo.entities.Post;
import com.lucasxavier.springbootmongo.repositories.PostRepository;
import com.lucasxavier.springbootmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired 
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> post = repository.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado"));
	}
}
