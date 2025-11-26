package com.example.workshopingmongo.config;

import com.example.workshopingmongo.repository.PostRepository;
import com.example.workshopingmongo.repository.UserRepository;
import domain.Post;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.TimeZone;


@Configuration
public class instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "maria Brown", "maria@gmail.com");
        User alex = new User(null, "alex Brown", "alex@gmail.com");
        User bob = new User(null, "bob Brown", "bob@gmail.com");

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para SP", maria);
        Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei Feliz hoje", maria);

        userRepository.save(maria);
        userRepository.save(alex);
        userRepository.save(bob);

        postRepository.save(post1);
        postRepository.save(post2);


    }
}
