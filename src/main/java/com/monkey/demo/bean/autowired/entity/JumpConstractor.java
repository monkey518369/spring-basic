package com.monkey.demo.bean.autowired.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @program: springbasic
 * @description:
 * @author: monkey
 * @create: 2018-11-08 23:04
 **/

@Component
public class JumpConstractor {

    private Animal animal;

    @Autowired(required = false)
    public JumpConstractor(@Qualifier("dog") Animal animal){
        this.animal = animal;
    }


    public void getAnimal(){
        animal.food();
    }
}
