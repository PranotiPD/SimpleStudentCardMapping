package com.example.StudentCardMappingDemo;

import com.example.StudentCardMappingDemo.models.Card;
import com.example.StudentCardMappingDemo.models.Student;
import com.example.StudentCardMappingDemo.repository.CardRepository;
import com.example.StudentCardMappingDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentCardMappingDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentCardMappingDemoApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	CardRepository cardRepository;
	@Override
	public void run(String... args) throws Exception {

		Student student = new Student( "Nihal", 8);
		Card card = new Card();

		card.setFine(120.00);
		studentRepository.save(student);
		card.setStudent(student);
		cardRepository.save(card);

	}
}
