package com.gsonkeno.circular.dependency.staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StaffA {
    private StaffB staffB;

    private String name;

    @Autowired
    public void setStaffB(StaffB staffB) {
        this.staffB = staffB;
    }

    public StaffB getStaffB() {
        return staffB;
    }
}
