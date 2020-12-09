package com.twxiao.oop.InterfaceDemo;

/*
接口的实现类使用 implments方法实现接口，一个实现类可以实现多个接口
 */
public class UserServiceImpl implements UserService {

    /*
    实现类中必须实现接口类的所有方法
     */
    @Override
    public void addUser(String name) {

    }

    @Override
    public void delUser(String name) {

    }
}
