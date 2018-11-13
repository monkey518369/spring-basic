package com.monkey.demo.bean.autowired.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @program: springbasic
 * @description:
 * @author: monkey
 * @create: 2018-11-08 23:06
 **/

/**
 * 当在方法上使用autowired注解的时候，spring创建该类的时候
 * 会自动注入该参数，即自动执行该方法一次。
 * spring会查找合适的bean注入·当出先多个合适的时候会报错，所以可以配合Qualifier使用
 * 当没有合适的时候会报错，所以可以使用require=false，
 */
@Component
public class JumpSet {

    private Animal animal;

    public void getAnimal(){
        animal.food();
    }

    @Autowired(required = false)
    @Qualifier("cat")
    public void setAnimal(Animal animal){
        this.animal = animal;
        System.out.println("init jumset");
    }

}
