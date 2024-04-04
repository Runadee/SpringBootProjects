package com.developeredanur.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudent(){

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
