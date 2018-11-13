package com.monkey.demo.bean.major.runtime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @program: springbasic
 * @description:
 * @author: monkey
 * @create: 2018-11-09 01:31
 **/
@Configuration
@PropertySource("classpath:/com/monkey/demo/bean/major/runtime/test.properties")
public class Test {

    @Autowired
    private Environment environment;
}
