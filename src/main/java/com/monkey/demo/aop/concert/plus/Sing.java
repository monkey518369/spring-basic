package com.monkey.demo.aop.concert.plus;

/**
 * @program: springbasic
 * @description:
 * @author: monkey
 * @create: 2018-11-13 22:05
 **/
public class Sing implements Action {

    @Override
    public void action() {
        System.out.println("i am singing in the sky");
    }
}
