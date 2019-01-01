package com.gsonkeno.circular.dependency.student;

import org.springframework.stereotype.Component;

@Component
public class StudentA {

    private final StudentB studentB;

    public StudentA(StudentB studentB) {
        this.studentB = studentB;
    }
}
