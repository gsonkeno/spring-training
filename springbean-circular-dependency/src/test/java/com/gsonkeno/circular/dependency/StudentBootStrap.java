package com.gsonkeno.circular.dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentBootStrap {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("student_beans.xml");
    }
}
