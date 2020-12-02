package com.twxiao.base;

public class Demo4 {
    //变量：可以变的量，根据作用域不同分为类变量、实例变量、局部变量

    //类变量，static
    static int salary=100;

    /*
     实例变量,实例变量可以不进行初始化。如未进行初始化，系统自动添加默认值
     数值型默认值为 0 或 0.0 ，分别对应整数和浮点数
     布尔型默认值为false
     除了基本类型之外的所有数据类型的默认值，均为null
     */
    String name;
    int age;


    public static void main(String[] args) {

        //局部变量，声明时必须进行初始化赋值
        int i=10;
        System.out.println(i);

        //调用实例变量，需要先实例化一个对象
        Demo4 d4 =new Demo4();
        System.out.println(d4.age);
        System.out.println(d4.name); //声明变量未初始化，注意默认值

        //类变量，在类内部可以直接调用
        System.out.println(salary);

    }
}
