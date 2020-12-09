package com.twxiao.oop.OverrideDemo;

/*
重写：
类的继承中，子类集成了父类非私有的属性和方法。
子类可以在父类方法的基础上进行扩充，让方法的功能更加符合子类的需求。
 */

public class App {

    public static void main(String[] args) {

        //实例化子类
        Student s1 = new Student();
       //student类继承了父类Person中的非私有的方法和属性，所以可以直接使用name属性和run方法。
        s1.run();
        s1.setName("李明");

        //学生的跑不方法与父类中的不同，所以可以在子类中给run方法增加一些功能。
        //如果子类中重写了父类的方法，那么子类的实例对象将调用子类中重写后的方法。
        s1.run(s1.name);

        Teacher t1=new Teacher();  //一个类对象的实际类型是确定的
        t1.run("王老师");

        Person p1 = new Person();
        p1.run("原始人");


        /*
        .多态的定义与使用格式（前提是必须有继承关系）
         定义格式：父类类型 变量名=new 子类类型();
         注意：在使用多态后的父类引用变量调用方法时，会调用子类重写后的方法。
        */
        p1=s1;
        p1.run("p1");
        p1=t1;
        p1.run("p1");



    }
}
