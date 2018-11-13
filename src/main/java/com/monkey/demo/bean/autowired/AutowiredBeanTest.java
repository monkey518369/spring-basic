package com.monkey.demo.bean.autowired;

import com.monkey.demo.bean.autowired.entity.Animal;
import com.monkey.demo.bean.autowired.entity.JumpConstractor;
import com.monkey.demo.bean.autowired.entity.JumpSet;
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
 * @create: 2018-11-08 22:25
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BeanAutowiredConfig.class)
public class AutowiredBeanTest {

    @Autowired
    @Qualifier("cat")
    private Animal animal;

    @Autowired
    private JumpConstractor jumpConstractor;

    @Autowired
    private JumpSet jumpSet;

    @Test
    public void getAction(){
        animal.action();
        jumpConstractor.getAnimal();
        jumpSet.getAnimal();
    }


}
