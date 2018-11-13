package com.monkey.demo.aop.concert;

import org.springframework.stereotype.Component;

/**
 * @program: springbasic
 * @description:
 * @author: monkey
 * @create: 2018-11-13 00:02
 **/
@Component
public class MonkeyPerformance implements Performance {

    @Override
    public void perform(int sum) {
        System.out.println("monkey perfoming" + sum);
    }
}
