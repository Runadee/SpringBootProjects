package com.developeredanur.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent(){

     Student student = new Student(123456, "John", "Doe", LocalDate.of(2000, 5, 15), 11);

       return (List<Student>) student;
    }

}
