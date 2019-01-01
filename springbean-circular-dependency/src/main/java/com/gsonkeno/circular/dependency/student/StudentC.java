package com.gsonkeno.circular.dependency.student;

import org.springframework.stereotype.Component;

@Component
public class StudentC {
    private final StudentA studentA;

    public StudentC(StudentA studentA) {
        this.studentA = studentA;
    }
}
