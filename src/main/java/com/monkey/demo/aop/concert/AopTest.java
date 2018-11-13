package com.monkey.demo.aop.concert;

import com.monkey.demo.aop.concert.plus.Action;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: springbasic
 * @description:
 * @author: monkey
 * @create: 2018-11-13 00:04
 **/
@ContextConfiguration(classes = AopConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AopTest {

    @Autowired
    Performance performance;

    @Test
    public void execute(){
        performance.perform(12);
        Action action = (Action)performance;
        action.action();
    }

}
