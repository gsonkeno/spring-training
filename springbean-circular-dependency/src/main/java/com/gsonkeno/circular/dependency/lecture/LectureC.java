package com.gsonkeno.circular.dependency.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LectureC {
    private LectureA lectureA;

    @Autowired
    public void setLectureA(LectureA lectureA) {
        this.lectureA = lectureA;
    }

    public LectureA getLectureA() {
        return lectureA;
    }
}
