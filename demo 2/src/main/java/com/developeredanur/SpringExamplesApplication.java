package com.developeredanur;

import com.developeredanur.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExamplesApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(
						1L,
						"Eda",
						"eda@developer.com",
						LocalDate.of(2024, Month.APRIL,4),
						29
				)
		);
	}

}
