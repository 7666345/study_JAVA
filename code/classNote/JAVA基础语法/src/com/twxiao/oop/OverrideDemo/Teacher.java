package com.twxiao.oop.OverrideDemo;

public class Teacher extends Person {

    @Override
    public void run(String name) {
        //super.run(name);//Super可以直接调用父类的方法
        System.out.println(name+"在看台看学生跑。");
    }
}
