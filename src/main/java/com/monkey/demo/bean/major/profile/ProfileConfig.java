package com.monkey.demo.bean.major.profile;

import com.monkey.demo.bean.java.entity.Animal;
import com.monkey.demo.bean.java.entity.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @program: springbasic
 * @description:
 * 激活profile的的方式又多种
 * 1.作为dispatcherServlet的初始化参数
 * 2.作为web应用的上下文参数
 * 3.作为JNDI条目
 * 4.作为环境变量
 * 5.作为jvm系统属性
 * 6.集成在测试类上，使用@ActiveProfiles注解设置
 * @author: monkey
 * @create: 2018-11-09 01:04
 **/
@Configuration
@Profile("dev")
public class ProfileConfig {

    /**因为定义了profile所以该profeilConfig只会在dev模式下起作用
     * profile也可以应用在方法级别上
     */
    @Bean
    @Profile("dev")
    public Animal animal(){
        return new Dog();
    }

}
