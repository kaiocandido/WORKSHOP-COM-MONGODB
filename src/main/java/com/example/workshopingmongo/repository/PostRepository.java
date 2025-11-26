package com.example.workshopingmongo.repository;

import domain.Post;
import domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
