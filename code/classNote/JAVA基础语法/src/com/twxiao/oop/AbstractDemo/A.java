package com.twxiao.oop.AbstractDemo;

public class A extends Abstract {

    //抽象类里的抽象方法，必须有子类来实现
    @Override
    public void doSomething() {
        System.out.println("子类要实现继承的抽象类中的方法");
    }

    public static void main(String[] args) {
        A a = new A();
        a.say();//抽象类中的普通方法是可以正常继承调用的
    }


}
