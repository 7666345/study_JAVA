package com.twxiao.oop.OverrideDemo;

/*
父类
 */

public class Person {
    String name;

    public void run(String name){
        System.out.println(name+"两条腿跑...");
    }

    public void run(){
        System.out.println("用两条腿跑");
    }

    //使用set/get方法封装: alt + insert


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
