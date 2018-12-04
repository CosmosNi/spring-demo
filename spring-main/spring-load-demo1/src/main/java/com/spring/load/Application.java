package com.spring.load;

import com.spring.load.factory.UserFactoryBean;
import com.spring.load.pojo.User;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: Cosmos
 * @program: pinpoint
 * @Description: ${description}
 * @Date: Create in 2018-11-28 08:17
 * @Modified By：
 */
public class Application {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
        User u = (User) ac.getBean("user");
        System.out.println(u);
        // 获取user的factorybean
        UserFactoryBean factory = (UserFactoryBean) ac.getBean("&user");
        System.out.println(factory.getUserInfo());
    }
}
