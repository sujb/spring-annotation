package com.su.test;

import com.su.spring.config.SpringLifeCycleConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description :
 * @Author : sujinbo
 * @Date : 2018/7/26 10:18
 */
public class TestLifeCycle {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringLifeCycleConfig.class);
        applicationContext.getBean("cat");
        applicationContext.close();
    }

}
