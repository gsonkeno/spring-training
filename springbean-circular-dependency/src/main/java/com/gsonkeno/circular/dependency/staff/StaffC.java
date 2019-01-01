package com.gsonkeno.circular.dependency.staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StaffC {
    private StaffA staffA;

    @Autowired
    public void setStaffA(StaffA staffA) {
        this.staffA = staffA;
    }

    public StaffA getStaffA() {
        return staffA;
    }
}
