package com.twxiao.oop.InterfaceDemo;

/*
接口，使用 interface关键字，而不是class关键词

接口的本质就是约束。
 */
public interface UserService {

    //接口中的定义默认都是 public abstract 的
    public abstract void addUser(String name);  //只约束，由接口的实现类来具体实现。一般在实现类命名时，会在结尾加 Impl
    public abstract void delUser(String name);


}
