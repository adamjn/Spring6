package com.atguigu.spring6.iocxml.life;

public class User {
    public User() {
        System.out.println("part 1");
    }

    public void initMethod(){
        System.out.println("part 4");
    }

    public void destroyMethod(){
        System.out.println("5");
    }

    public User(String name) {
        this.name = name;

    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("part 2");
        this.name = name;
    }
}
