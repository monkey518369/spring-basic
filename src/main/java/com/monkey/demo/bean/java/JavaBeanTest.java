package com.monkey.demo.bean.java;

import com.monkey.demo.bean.java.entity.ActionJump;
import com.monkey.demo.bean.java.entity.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: springbasic
 * @description:
 * @author: monkey
 * @create: 2018-11-08 23:32
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaBeanConfig.class)
public class JavaBeanTest {

    @Autowired
    @Qualifier("dog")
    private Animal dog;

    @Autowired
    @Qualifier("cat")
    private Animal cat;

    @Autowired
    @Qualifier("animal")
    private Animal random;

    @Autowired
    @Qualifier("dogJump")
    private ActionJump dogJump;

    @Autowired
    @Qualifier("randomJump")
    private ActionJump randomJump;


    @Test
    public void test(){
        dog.action();
        cat.action();
        random.action();
        dogJump.actionJump();
        randomJump.actionJump();
    }


}
