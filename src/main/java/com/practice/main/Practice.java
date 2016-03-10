package com.practice.main;

import com.practice.SayByebye;
import com.practice.SayHello;
import com.practice.SaySomething;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chaoqun.zhu on 2016/3/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config.xml")
public class Practice {
    @Autowired
    private SayByebye bye;

    @Autowired
    private SayHello hello;

//    @Test
//    public void testSaySth(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//
//        SaySomething saySomething = context.getBean("hello", SaySomething.class);
//        saySomething.sayBlablabla();
//
//        saySomething = context.getBean("bye", SaySomething.class);
//        saySomething.sayBlablabla();
//    }

    @Test
    public void testAnnotation(){
        hello.sayBlablabla();
        bye.sayBlablabla();
    }
}
