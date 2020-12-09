package com.twxiao.oop.AbstractDemo;

/*
abstract关键字+类名/方法名 = 抽象类/抽象方法。
抽象类/抽象方法，作为具体业务实现的约束出现，不包含具体的实现代码。需要由子类继承抽象类后，实现具体业务代码。

抽象类不能new实例

抽象类中可以包含普通方式和抽象方法。而抽象方法必须是放在抽象类中。
 */
public abstract class Abstract {

    //抽象方法只有方法名，没有方法体
    public abstract void doSomething();

    //抽象类中允许出现普通方法
    public void say(){
        System.out.println("我是普通方法");
    }
}
