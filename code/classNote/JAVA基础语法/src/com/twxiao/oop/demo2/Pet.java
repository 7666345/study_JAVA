package com.twxiao.oop.demo2;

public class Pet {

    String name;
    int age;

    public Pet(String name,int age) {
        this.name = name;
        this.age=age;
    }

    public Pet() {
        //如果使用了带参数的构造函数，就必须把默认构造函数也写出来。

    }

    public void shout(){
        System.out.println(this.name+"叫了一声");
    }
}
