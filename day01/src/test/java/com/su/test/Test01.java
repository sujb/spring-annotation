package com.su.test;

import com.su.spring.bean.Person;
import com.su.spring.config.SpringConfig;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Description :
 * @Author : sujinbo
 * @Date : 2018/7/25 10:57
 */
public class Test01 {

    @Test
    public void test01() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("spring.xml"));
        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String bean : beanDefinitionNames) {
            System.out.println(bean);
        }
    }

}
