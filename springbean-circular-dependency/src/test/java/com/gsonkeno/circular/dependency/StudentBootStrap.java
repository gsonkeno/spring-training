package com.gsonkeno.circular.dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentBootStrap {

    public static void main(String[] args) {
        // 构造器循环依赖，启动报错
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("student_beans.xml");
    }
}
