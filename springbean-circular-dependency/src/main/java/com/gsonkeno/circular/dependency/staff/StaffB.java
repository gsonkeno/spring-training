package com.gsonkeno.circular.dependency.staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StaffB {
    private StaffC staffC;

    @Autowired
    public void setStaffC(StaffC staffC) {
        this.staffC = staffC;
    }

    public StaffC getStaffC() {
        return staffC;
    }
}
