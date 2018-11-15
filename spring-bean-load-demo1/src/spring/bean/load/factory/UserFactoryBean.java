/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.bean.load.factory;

import org.springframework.beans.factory.FactoryBean;
import spring.bean.load.pojo.User;

/**
 *
 * @author admin
 */
public class UserFactoryBean implements FactoryBean<User> {

    private String userInfo;
    
    /**
     *返回由factoryBean创建的bean实例，如果isSingleton()返回true
     * ,则该实例会放到spring容器中单实例缓存池中
     * @return
     * @throws Exception 
     */
    @Override
    public User getObject() throws Exception {
        User user = new User();
        String[] infos = userInfo.split(",");
        user.setName(infos[0]);
        user.setPassword(infos[1]);
        return user;
    }

    //bean的作用域
    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

}
