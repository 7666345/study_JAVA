package com.twxiao.method;

public class Demo1 {
    public static void main(String[] args) {

        //调用下面的addNumber()方法
        int mySum=addNumber(12,13);

        System.out.println(mySum);

    }

    /*
      方法的定义:
      修饰符：可选，标定方法的作用域等。例如 public、static等
      返回值类型： 方法运算完成需要返回给调用者的数据类型，如int、float、Strint等。无返回值则写 void
      方法名： 小写字母开头 + 驼峰原则。
      方法的参数类型及参数名：
     */

    static int addNumber(int a, int b){
        int sum=a+b;
        return sum; //return不但可以返回值，还会结束方法的执行。
    }
}
