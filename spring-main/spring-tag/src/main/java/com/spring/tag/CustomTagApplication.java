/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.tag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.tag.pojo.User;

/**
 *自定义标签的使用
 * 
 * @author admin
 */
public class CustomTagApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("classpath:spring.xml");
        User user = (User) bf.getBean("user");
        System.out.println(user);
    }
    
}
