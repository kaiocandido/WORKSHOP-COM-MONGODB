package com.example.workshopingmongo.config;

import com.example.workshopingmongo.repository.UserRepository;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;


@Configuration
public class instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User maria = new User(null, "maria Brown", "maria@gmail.com");
        User alex = new User(null, "alex Brown", "alex@gmail.com");
        User bob = new User(null, "bob Brown", "bob@gmail.com");

        userRepository.save(maria);
        userRepository.save(alex);
        userRepository.save(bob);


    }
}
