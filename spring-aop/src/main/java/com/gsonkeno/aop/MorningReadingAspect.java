package com.gsonkeno.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 晨读切面
 * @author gaosong
 * @since 2019-01-06
 */
@Aspect
@Component
public class MorningReadingAspect {
    private static Log log = LogFactory.getLog(MorningReadingAspect.class);

    /**
     * 所有类的readBook方法作为切点
     */
    @Pointcut("execution(* *.readBook(..))")
    public void readBookPointCut(){
    }

    @Before("readBookPointCut()")
    public void beforeReadBook(){
        log.debug("走进教室");
    }

    @After("readBookPointCut()")
    public void afterReadBook(){
        log.debug("走进食堂");
    }

    @Around("readBookPointCut()")
    public Object aroundReadBook(ProceedingJoinPoint point){
        log.debug("晨读前需要起床、洗漱、跑步");
        Object o = null;

        try {
            o = point.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        log.debug("晨读后需要吃早餐");
        return o;
    }
}
