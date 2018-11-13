package com.monkey.demo.bean.java.entity;

/**
 * @program: springbasic
 * @description:
 * @author: monkey
 * @create: 2018-11-08 23:52
 **/
public class ActionJump {

    private Animal animal;

    public ActionJump(Animal animal){
        this.animal = animal;
    }

    public void actionJump(){
        animal.action();
    }

}
