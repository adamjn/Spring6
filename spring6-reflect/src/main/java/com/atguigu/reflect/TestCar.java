package com.atguigu.reflect;

import org.junit.jupiter.api.Test;

public class TestCar {
    @Test
    public void test01() throws Exception{
        Class clazz1 = Car.class;
        Class clazz2 = new Car().getClass();
        Class clazz3 = Class.forName("com.atguigu.reflect.Car");

        //实例化
        Car car = (Car)clazz3.getConstructor().newInstance();
        System.out.println(car);
    }
}
