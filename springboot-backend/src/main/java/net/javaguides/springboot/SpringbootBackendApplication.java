package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

//to insert a few records in the User table we will implement a CommandLineRunner
//that provides a run-method. This run method will execute when we deploy our application
//in an embedded...?

@SpringBootApplication
@Component
public class SpringbootBackendApplication implements CommandLineRunner {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("BEGIN");
		
		this.userRepository.save(new User("Jessica", "Andersson", "jessicaAndersson@hotmail.com"));
		this.userRepository.save(new User("Carl", "Svensson", "carlSvensson@gmail.com"));
		this.userRepository.save(new User("Fredrik", "Johansson", "fredrikJohansson@hotmail.com"));
		
		
		System.out.println("END");
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	
	
	
}
