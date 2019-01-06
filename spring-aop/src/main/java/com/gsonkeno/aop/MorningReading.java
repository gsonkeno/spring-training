package com.gsonkeno.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

/**
 * 晨读
 */
@Component
public  class MorningReading {
    private static Log log = LogFactory.getLog(MorningReading.class);

    /**
     * 注意，使用cglib做代理时，目标类不能是final类，因为cglib的工作原理是创建目标类的子类
     * 同时，目标方法也不能是final方法，否则切面无效
     */
    public  void readBook(){
        log.debug("在教室里晨读");
    }

    /**
     * 默认情况下，目标对象内部的自我调用，将无法实施切面增强功能
     */
    public void invokeReadBook(){
        // <aop:aspectj-autoproxy expose-proxy="true"></aop:aspectj-autoproxy>设置下如下方式调用,
        // 才能保证对象内部的自我调用，依然能够实施切面增强
        ((MorningReading)AopContext.currentProxy()).readBook();


        //无法实施切面增强
        //this.readBook();
    }


}
