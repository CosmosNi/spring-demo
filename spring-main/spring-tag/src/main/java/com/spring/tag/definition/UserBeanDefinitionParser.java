/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.tag.definition;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;
import com.spring.tag.pojo.User;

/**
 *
 * @author admin
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    //element对应的类
    @Override
    protected Class getBeanClass(Element element) {
        return User.class;
    }

    //从element中解析并提取对应的元素
    @Override
    protected void doParse(Element element, BeanDefinitionBuilder bean) {
        String userName = element.getAttribute("userName");
        String email = element.getAttribute("email");
        
        //将提取的数据放入到BeanDefinitionBuilder，待完成所有bean的解析后统一注册到beanfatory中
        if (StringUtils.hasText(userName)) {
            bean.addPropertyValue("userName", userName);
        }
        if (StringUtils.hasText(email)) {
            bean.addPropertyValue("email", email);
        }
    }

}
