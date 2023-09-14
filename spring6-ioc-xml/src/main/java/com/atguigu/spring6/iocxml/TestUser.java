package com.atguigu.spring6;

import com.atguigu.spring6.iocxml.User;
import com.atguigu.spring6.iocxml.bean.UserDao;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //id bean
        User user1 = (User)context.getBean("user");
        System.out.println(user1);

        //

        User user2 = context.getBean(User.class);
        System.out.println(user2);

        User user3 = context.getBean("user", User.class);

        System.out.println(user3);
    }

}
