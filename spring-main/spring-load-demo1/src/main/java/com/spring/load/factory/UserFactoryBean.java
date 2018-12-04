package com.spring.load.factory;

import com.spring.load.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: Cosmos
 * @program: pinpoint
 * @Description: 自定义解析的bean
 * @Date: Create in 2018-11-28 08:21
 * @Modified By：
 */

public class UserFactoryBean implements FactoryBean<User> {

    private String userInfo;


    /**
     *返回由factoryBean创建的bean实例，如果isSingleton()返回true
     * ,则该实例会放到spring容器中单实例缓存池中
     * @return
     * @throws Exception
     */
    public User getObject() throws Exception {
        User user = new User();
        String[] infos = userInfo.split(",");
        user.setName(infos[0]);
        user.setPassword(infos[1]);
        return user;
    }

    //bean的作用域
    public Class<?> getObjectType() {
        return User.class;
    }

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


