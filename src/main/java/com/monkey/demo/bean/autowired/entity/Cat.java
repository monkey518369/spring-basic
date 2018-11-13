package com.monkey.demo.bean.autowired.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @program: springbasic
 * @description:  @Component注解标识该类为一个spring组件
 * @author: monkey
 * @create: 2018-11-08 22:41
 **/

/**
 * component默认会使用类名第一个字母小写作为qualifier
 * 可以显示的指定一个qualifier,当使用autowire注解时可以和qualifier配合使用
 * 当有多个合适的bean时可以使用qualifier来进行区分
 * 使用scope属性可以指定bean的作用域，spring创建bean默认作用域为singleton
 * 可以设置为prototype，session ，request
 * scope可以和bean和component一起使用
 * proxyMode解决了当不同作用域的bean注入到单例实例时候的问题，
 * proxy——mode会先把一个代理注入到单例中，单使用的时候才真正的去查找应该注入的实例
 */
@Component
@Qualifier("cat")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.INTERFACES)
public class Cat implements Animal {

    @Override
    public void action() {
        System.out.println("i can jump");
    }

    @Override
    public void food() {
        System.out.println("i eat everything");
    }
}
