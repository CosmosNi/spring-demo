/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.tag.handle;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import spring.tag.definition.UserBeanDefinitionParser;

/**
 *
 * @author admin
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport{

    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
    
}
