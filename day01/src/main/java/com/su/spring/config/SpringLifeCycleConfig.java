package com.su.spring.config;

import com.su.spring.bean.Cat;
import com.su.spring.bean.Dog;
import com.su.spring.bean.MyBeanPostProcessor;
import com.su.spring.bean.Pig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description :
 * bean在完成构建属性注入后可以执行指定的初始化方法
 * 容器关闭前可以执行指定的销毁方法
 * 1、通过@Bean注解
 * @Bean(initMethod = "init",destroyMethod = "destory")
 * 2、通过接口实现
 * InitializingBean,DisposableBean
 * 3、通过注解
 * @PostConstruct，@PreDestroy
 * 4、beanPostProcessor接口
 * postProcessBeforeInitialization，在构造方法之后，其他初始化方法之前执行
 * postProcessAfterInitialization，在其他初始化方法之后执行
 *
 * 相关代码
 * try {
    populateBean(beanName, mbd, instanceWrapper);
    if (exposedObject != null) {
    exposedObject = initializeBean(beanName, exposedObject, mbd);
    }
    }

protected Object initializeBean(final String beanName, final Object bean, RootBeanDefinition mbd) {
if (System.getSecurityManager() != null) {
AccessController.doPrivileged(new PrivilegedAction<Object>() {
@Override
public Object run() {
invokeAwareMethods(beanName, bean);
return null;
}
}, getAccessControlContext());
}
else {
invokeAwareMethods(beanName, bean);
}

Object wrappedBean = bean;
if (mbd == null || !mbd.isSynthetic()) {
wrappedBean = applyBeanPostProcessorsBeforeInitialization(wrappedBean, beanName);
}

try {
invokeInitMethods(beanName, wrappedBean, mbd);
}
catch (Throwable ex) {
throw new BeanCreationException(
(mbd != null ? mbd.getResourceDescription() : null),
beanName, "Invocation of init method failed", ex);
}
if (mbd == null || !mbd.isSynthetic()) {
wrappedBean = applyBeanPostProcessorsAfterInitialization(wrappedBean, beanName);
}
return wrappedBean;
}
 *
 * @Author : sujinbo
 * @Date : 2018/7/26 10:17
 */
@Configuration
public class SpringLifeCycleConfig {

    @Bean(initMethod = "init",destroyMethod = "destory")
    public Cat cat(){
        return new Cat();
    }

    @Bean
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public Pig pig(){
        return new Pig();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

}
