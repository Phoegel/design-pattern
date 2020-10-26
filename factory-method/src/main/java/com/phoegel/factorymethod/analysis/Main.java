package com.phoegel.factorymethod.analysis;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        // spring 配置文件
        String config = "applicationContext.xml";
        // 可能平常我们都是这样写的
        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        // 这里我为了与前面介绍的角色一致，下面的两种方式使用了同一个接口接收
        // 1、通过 ApplicationContext 容器读取配置
        BeanFactory context = new ClassPathXmlApplicationContext(config);
        Person person1 = (Person) context.getBean("person");
        System.out.println(person1);
        System.out.println("----------------------------");
        // 2、通过 BeanFactory 容器读取配置
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource(config));
        Person person2 = (Person) factory.getBean("person");
        System.out.println(person2);
    }
}
