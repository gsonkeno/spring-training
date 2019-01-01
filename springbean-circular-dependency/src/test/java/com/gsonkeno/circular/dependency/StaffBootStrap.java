package com.gsonkeno.circular.dependency;

import com.gsonkeno.circular.dependency.staff.StaffA;
import com.gsonkeno.circular.dependency.staff.StaffB;
import com.gsonkeno.circular.dependency.staff.StaffC;
import org.junit.Assert;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaffBootStrap {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("staff_beans.xml");
        StaffA staffA = context.getBean(StaffA.class);
        StaffB staffB = context.getBean(StaffB.class);
        StaffC staffC = context.getBean(StaffC.class);

        Assert.assertEquals(staffA, staffC.getStaffA());
        Assert.assertEquals(staffB, staffA.getStaffB());
        Assert.assertEquals(staffC, staffB.getStaffC());
    }
}
