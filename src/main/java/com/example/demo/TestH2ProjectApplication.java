package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestH2ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestH2ProjectApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(UserRepository userRepository){
//		return args -> {
//			userRepository.save(new User("Tony", "Stark", "T.Stark@avengers.com") );
//		};
//	}



}
