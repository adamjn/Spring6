package com.atguigu.spring6.iocxml.bean;

import com.atguigu.spring6.iocxml.User;

public class UserDaoImpl implements UserDao {

    @Override
    public void run(){
        System.out.println("run......");
    }
}
