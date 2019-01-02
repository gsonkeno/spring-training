package com.gsonkeno.circular.dependency.student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class StudentA {
    private static Log log = LogFactory.getLog(StudentA.class);


    private final StudentB studentB;

    public StudentA(StudentB studentB) {
        log.debug("---begin StudentA constructor----");
        this.studentB = studentB;
    }
}
