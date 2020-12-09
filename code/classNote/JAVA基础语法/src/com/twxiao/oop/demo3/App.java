package com.twxiao.oop.demo3;

public class App {

    public static void main(String[] args) {

        //实例化Student类的对象
        Student s1 = new Student();
        /*
        由于Student中属性是私有的，所以不能使用 s1.name   s1.age等形式操作.
        要调用类内定义的set/get方法来操作属性
         */

        s1.setName("Andy");//setName()方法，设置s1的属性值。
        s1.setAge(350);

        System.out.println(s1.getName());//getName()方法，获取属性值
        System.out.println(s1.getAge());


    }
}
