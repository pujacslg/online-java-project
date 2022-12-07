package com.example.SpringSecurityPractise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringSecurityPractiseApplication implements CommandLineRunner {
	@Autowired
	UserDataRepo udr;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityPractiseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserData ud1 = new UserData();
		ud1.setName("Puja");
		ud1.setPassword("1234");
		ud1.setRole("ROLE_ADMIN");
		ud1.setEmail("pujacslg@gmail.com");
		udr.save(ud1);
		UserData ud2 = new UserData();
		ud2.setName("Purba");
		ud2.setPassword("4321");
		ud2.setRole("ROLE_STUDENT");
		ud2.setEmail("purbacslg@gmail.com");
		udr.save(ud2);

	}

}
