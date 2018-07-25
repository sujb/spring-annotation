package com.su.spring.config;

import com.su.spring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description :
 * @Author : sujinbo
 * @Date : 2018/7/25 11:08
 */
@Configuration
public class SpringConfig {

    @Bean
    public Person person(){
        Person person = new Person();
        person.setAge(11);
        person.setName("annotation");
        return person;
    }

}
