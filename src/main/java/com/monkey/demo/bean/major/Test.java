package com.monkey.demo.bean.major;

import com.monkey.demo.bean.major.profile.ProfileConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: springbasic
 * @description:
 * @author: monkey
 * @create: 2018-11-09 00:14
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProfileConfig.class)
@ActiveProfiles("dev")
public class Test {

}
