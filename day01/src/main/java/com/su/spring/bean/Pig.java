package com.su.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description :
 * @Author : sujinbo
 * @Date : 2018/7/26 10:28
 */
public class Pig {

    public Pig() {
        System.out.println(" pig constructor ...");
    }

    @PostConstruct
    public void init(){
        System.out.println("pig init ...");
    }

    @PreDestroy
    public void destory(){
        System.out.println("pig destroy");
    }
}
