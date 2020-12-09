package com.twxiao.oop.demo2;

public class App {
    public static void main(String[] args) {

        Pet dog = new Pet(); //实例化一个Pet的实例dog
        dog.name="旺财";
        dog.age=3;

        dog.shout();


        Pet cat=new Pet();
        cat.name="大黄";
        cat.age=2;
        cat.shout();
    }
}
