package com.su.spring.bean;

/**
 * @Description :
 * @Author : sujinbo
 * @Date : 2018/7/26 10:15
 */
public class Cat {

    public Cat() {
        System.out.println(" cat constructor ...");
    }


    public void init(){
        System.out.println(" cat init - method  ...");
    }

    public void destory(){
        System.out.println(" cat destory - method ...");
    }

}
