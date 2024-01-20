package net.javaguides.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;


@SpringBootApplication
public class ReactSpringDemo2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringDemo2Application.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("priya","B","sp@gmail.com"));
		this.userRepository.save(new User("karthi","C","karthi@gmail.com"));
		this.userRepository.save(new User("Balaji","C","balaji@gmail.com"));
		
	}

}
