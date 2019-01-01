package com.gsonkeno.circular.dependency.student;

import org.springframework.stereotype.Component;

@Component
public class StudentB {

    private final StudentC studentC;

    public StudentB(StudentC studentC) {
        this.studentC = studentC;
    }


}
