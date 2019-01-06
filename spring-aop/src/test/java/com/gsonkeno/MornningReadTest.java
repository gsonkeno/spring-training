package com.gsonkeno;

import com.gsonkeno.aop.MorningReading;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MornningReadTest {
    private static Log log = LogFactory.getLog(MornningReadTest.class);

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("morning.xml");
        MorningReading reading = context.getBean(MorningReading.class);
        log.debug("----------");
        reading.readBook();
        log.debug("----------");
        reading.invokeReadBook();
    }
}
