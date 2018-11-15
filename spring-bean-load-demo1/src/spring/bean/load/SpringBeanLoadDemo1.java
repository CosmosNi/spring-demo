/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.bean.load;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.bean.load.pojo.User;

/**
 *
 * @author admin
 */
public class SpringBeanLoadDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/bean/load/xml/spring.xml");
        User u = (User) ac.getBean("user");
        System.out.println(u);
    }
    
}
