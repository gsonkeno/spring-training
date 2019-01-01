package com.gsonkeno.circular.dependency.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LectureA {
    private LectureB lectureB;

    @Autowired
    public void setLectureB(LectureB lectureB) {
        this.lectureB = lectureB;
    }

    public LectureB getLectureB() {
        return lectureB;
    }
}
