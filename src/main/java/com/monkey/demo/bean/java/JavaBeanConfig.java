package com.monkey.demo.bean.java;

import com.monkey.demo.bean.java.entity.ActionJump;
import com.monkey.demo.bean.java.entity.Animal;
import com.monkey.demo.bean.java.entity.Cat;
import com.monkey.demo.bean.java.entity.Dog;
import java.util.Random;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springbasic
 * @description:
 * @author: monkey
 * @create: 2018-11-08 23:32
 **/

@Configuration
public class JavaBeanConfig {


    /**
     * bean注解会告诉spring这个方法会返回一个对象，该对象要注册为spring应用上下文容器中的bean
     * 默认情况下产生的bean的名称和方法的名称时一致的，若要重命名可以使用name属性重新设置
     *
     * 有时候你设置可以使用animal方法那样返回bean
     * @return
     */
    @Bean(name="cat")
    @Qualifier("cat")
    public Animal getCat(){
        return new Cat();
    }


    @Bean(name="dog")
    @Qualifier("dog")
    public Animal getDog(){
        return new Dog();
    }

    @Bean(name = "animal")
    @Qualifier("animal")
    public Animal animal(){
        int i = new Random().nextInt();
        if(i%2==0){
            return new Cat();
        }else{
            return new Dog();
        }
    }

    /**
     * 在调用每个使用打了Bean注解的方法的时候，并不是真正的调用该方法，spring会拦截所有的
     * 调用，然后直接返回在spring中注册的bean。而spring中注册的bean默认时单例，即所有的
     * 该方法调用返回的都是同一个对象。
     * @return
     */
    @Bean(name = "randomJump")
    @Qualifier("randomJump")
    public ActionJump actionJump(){
        return new ActionJump(animal());
    }


    /**
     * 上面的自动注入可能看 起来又点奇怪，这样写可能更好，这里spring也会查找合适的animal
     * 注入方法中
     * @param animal
     * @return
     */
    @Bean(name = "dogJump")
    @Qualifier("dogJump")
    public ActionJump dogJump(@Qualifier("dog") Animal animal){
        return new ActionJump(animal);
    }
}
