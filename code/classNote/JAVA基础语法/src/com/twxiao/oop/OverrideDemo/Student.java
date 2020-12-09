package com.twxiao.oop.OverrideDemo;

/*
子类
 */

import java.sql.SQLOutput;

public class Student extends Person {

    String sNum;  //学号
    int grade;    //年级

    /*
    重写父类的run方法： alt + insert ---overridemethod

    在进行方法重写的时候需要遵循以下规则才能实现方法重写：
    1. 子类方法的参数列表必须和父类中被重写的方法的参数列表相同（参数个数和参数类型），否则只能实现方法的重载。
    2. 子类方法的返回值类型必须和父类中被重写的方法返回值类型相同，否则只能实现方法重载。
    3. 在Java规定，子类方法的访问权限不能比父类中被重写的方法的访问权限更小，必须大于或等于父类的访问权限。
    4. 在重写的过程中，如果父类中被重写的方法抛出异常，则子类中的方法也要抛出异常。但是抛出的异常也有一定的约束--->子类不能抛出比父类更多的异常，只能抛出比父类更小的异常，或者不抛出异常。
       例如：父类方法抛出Exception，那么子类就只能抛出IOException或者抛出比Exception小的异常或者不抛出异常。

     */

    @Override
    public void run(String name) {
        System.out.println("学生"+name+"是绕着操场跑,并且要喊口号..");
    }

    public String getsNum() {
        return sNum;
    }

    public void setsNum(String sNum) {
        this.sNum = sNum;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
