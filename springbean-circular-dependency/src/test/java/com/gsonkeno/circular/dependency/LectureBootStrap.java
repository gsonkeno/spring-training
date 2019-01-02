package com.gsonkeno.circular.dependency;

import com.gsonkeno.circular.dependency.lecture.LectureA;
import com.gsonkeno.circular.dependency.lecture.LectureB;
import com.gsonkeno.circular.dependency.lecture.LectureC;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LectureBootStrap {
    private static Log log = LogFactory.getLog(LectureBootStrap.class);

    public static void main(String[] args) {
        // bean + prototype
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lecture_beans.xml");

        log.debug("-----------lectureBootStrap assert begin------------");

        //注意，只有getBean时才会报错，启动不报错
        LectureA lectureA = context.getBean(LectureA.class);
        LectureB lectureB = context.getBean(LectureB.class);
        LectureC lectureC = context.getBean(LectureC.class);

        Assert.assertEquals(lectureA, lectureC.getLectureA());
        Assert.assertEquals(lectureB, lectureA.getLectureB());
        Assert.assertEquals(lectureC,lectureB.getLectureC());
    }
}
