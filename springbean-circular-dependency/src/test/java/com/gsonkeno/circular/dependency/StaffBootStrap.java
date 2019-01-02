package com.gsonkeno.circular.dependency;

import com.gsonkeno.circular.dependency.staff.StaffA;
import com.gsonkeno.circular.dependency.staff.StaffB;
import com.gsonkeno.circular.dependency.staff.StaffC;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaffBootStrap {
    private static Log log = LogFactory.getLog(StaffBootStrap.class);


    public static void main(String[] args) {
        // setter singleton 循环依赖，不报错
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("staff_beans.xml");

        log.debug("-----------staffBootStrap assert begin------------");
        StaffA staffA = context.getBean(StaffA.class);
        StaffB staffB = context.getBean(StaffB.class);
        StaffC staffC = context.getBean(StaffC.class);

        Assert.assertEquals(staffA, staffC.getStaffA());
        Assert.assertEquals(staffB, staffA.getStaffB());
        Assert.assertEquals(staffC, staffB.getStaffC());
    }
}
