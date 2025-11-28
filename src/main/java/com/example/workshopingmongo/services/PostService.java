package com.example.workshopingmongo.services;

import com.example.workshopingmongo.repository.PostRepository;
import com.example.workshopingmongo.services.execption.ObjectNotFoundExcepion;
import domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public Post findById(String id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundExcepion("Objeto não encontrado. ID: " + id));
    }

    public List<Post> findByTitle(String text){
        return postRepository.findByTitleContainingIgnoreCase(text);
    }

}
