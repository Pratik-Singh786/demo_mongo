package com.example.mongo.demomongo;

import com.example.mongo.demomongo.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMongoApplication.class, args);
		//User user = User.builder().age(10).bmi(12.3).name("ABC").build();//to create the object without the use of parameterised cons
		System.out.println("hello!!!");
	}
}