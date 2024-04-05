package com.developeredanur.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


import java.time.LocalDate;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
     private Long id;
     private String name;
     private String email;
     private LocalDate dob;
     private Integer age;


    public Student(int i, String john, String doe, LocalDate of, int i1) {
    }
}
