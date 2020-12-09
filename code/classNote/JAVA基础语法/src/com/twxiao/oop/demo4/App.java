package com.twxiao.oop.demo4;

//继承

public class App {
    public static void main(String[] args) {
        Man chineseMan = new Man();
        /*
        Man类继承自Person类，子类可以继承父类的方法
        所以，虽然Man类中虽然并未定义sleep()方法，
        却可以直接调用继承于父类的sleep()方法。
         */
        chineseMan.sleep();
    }
}
