package com.twxiao.oop.demo1;

public class Person {

    String name;

    /*
    构造器：
     使用new关键字实例化一个类对象的时候，其本质就是调用类的构造函数。
     构造函数就是一个与类名相同的，public的无返回值（连void都不写）方法。
     构造函数可以在类实例化对象的时候，给对象的属性初始化一个默认值。
     */

    public Person(){
        //默认的构造函数，没有参数。也叫无参数构造。
        this.name="克隆人";
    }

    public Person(String name){
        //带参数的构造函数。如果声明了有参数的构造函数，那么无参数构造函数必须显式声明出来。
        this.name=name; //用传入的参数name，给类的属性name赋值。
    }


}
