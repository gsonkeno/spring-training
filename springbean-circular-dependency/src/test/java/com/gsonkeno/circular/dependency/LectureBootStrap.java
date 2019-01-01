package com.gsonkeno.circular.dependency;

import com.gsonkeno.circular.dependency.lecture.LectureA;
import com.gsonkeno.circular.dependency.lecture.LectureB;
import com.gsonkeno.circular.dependency.lecture.LectureC;
import org.junit.Assert;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LectureBootStrap {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lecture_beans.xml");

        //注意，只有getBean时才会报错，启动不报错
        LectureA lectureA = context.getBean(LectureA.class);
        LectureB lectureB = context.getBean(LectureB.class);
        LectureC lectureC = context.getBean(LectureC.class);

        Assert.assertEquals(lectureA, lectureC.getLectureA());
        Assert.assertEquals(lectureB, lectureA.getLectureB());
        Assert.assertEquals(lectureC,lectureB.getLectureC());
    }
}
