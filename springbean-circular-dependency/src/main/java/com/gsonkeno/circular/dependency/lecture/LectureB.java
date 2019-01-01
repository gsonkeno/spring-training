package com.gsonkeno.circular.dependency.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LectureB {
    private LectureC lectureC;

    @Autowired
    public void setLectureC(LectureC lectureC) {
        this.lectureC = lectureC;
    }

    public LectureC getLectureC() {
        return lectureC;
    }
}
