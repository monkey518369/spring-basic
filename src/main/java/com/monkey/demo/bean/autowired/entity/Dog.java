package com.monkey.demo.bean.autowired.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @program: springbasic
 * @description:
 * @author: monkey
 * @create: 2018-11-08 23:22
 **/

@Component
@Qualifier("dog")
public class Dog implements Animal {


    @Override
    public void action() {
        System.out.println("i am a dog i can run");
    }

    @Override
    public void food() {
        System.out.println("i am a dog i eat meat");
    }
}
