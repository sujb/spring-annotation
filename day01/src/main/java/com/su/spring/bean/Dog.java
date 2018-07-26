package com.su.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Description :
 * @Author : sujinbo
 * @Date : 2018/7/26 10:19
 */
public class Dog implements InitializingBean,DisposableBean{

    public Dog() {
        System.out.println("dog constructor ...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("dog destroy ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("dog afterPropertiesSet...");
    }
}
