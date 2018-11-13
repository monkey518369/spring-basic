package com.monkey.demo.bean.autowired;

import com.monkey.demo.bean.autowired.entity.Cat;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springbasic
 * @description:
 * @author: monkey
 * @create: 2018-11-08 22:38
 **/

/**
 * componentScan默认会扫描配置类所在的包及其子包
 * 可以通过配置basePackages来设置需要扫描的包,可以通过，分隔的方式配置多个
 * 或者通过basePackageClasses来配置需要扫描的包，该属性中只需要设置需要扫描的包的中
 *   某个类就可以了,这样可以考虑再需要扫描的包中创建一个空接口，防止在代码重构中删除了配置的类。
 */
@Configuration
//@ComponentScan(basePackages = {"com.monkey.demo.bean.autowired","com.monkey.demo.bean.autowired.entity"})
@ComponentScan(basePackageClasses = {BeanAutowiredConfig.class,Cat.class})
public class BeanAutowiredConfig {

}
