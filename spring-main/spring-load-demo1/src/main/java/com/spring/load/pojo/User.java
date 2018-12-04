package com.spring.load.pojo;

/**
 * @Author: Cosmos
 * @program: pinpoint
 * @Description: ${description}
 * @Date: Create in 2018-11-28 08:22
 * @Modified By：
 */
public class User {

    private String name;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", password=" + password + '}';
    }

}

