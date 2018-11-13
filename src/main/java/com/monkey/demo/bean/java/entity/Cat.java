package com.monkey.demo.bean.java.entity;

/**
 * @program: springbasic
 * @description:
 * @author: monkey
 * @create: 2018-11-08 23:37
 **/
public class Cat implements Animal {

    @Override
    public void action() {
        System.out.println("i am a cat ,i cat jump");
    }

    @Override
    public void food() {
        System.out.println("i am a cat ,i eat everyThing");
    }
}
