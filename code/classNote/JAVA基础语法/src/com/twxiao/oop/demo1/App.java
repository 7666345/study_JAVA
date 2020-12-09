package com.twxiao.oop.demo1;

//每个应用应该只有一个main方法作为入口

public class App {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.name);//因为在构造函数中已经给属性指定了默认值，所以可以直接输出。

        Person p1=new Person("尤达大师");//向有参构造函数中传入参数，可以更个性化定制类的实例。
        System.out.println(p1.name);


        System.out.println("-----------------");

        //实例化学生类,类实例化后会返回一个类的实例对象
        //实例化对象可以用类中的属性和方法
        Student xm=new Student();
        xm.age=12;
        xm.name="小明";
        xm.grade=6;
        System.out.println(xm.name);//小明实例化后，对name属性赋值了，可以正常输出小明这个实例的name属性值。

        xm.study();

        System.out.println("-----------------");

        Student xh = new Student();

        System.out.println(xh.name);// xh实例化后并未对name属性赋值，所以输出name属性默认值：null



    }
}
