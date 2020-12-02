package com.twxiao.operator;

public class Demo2 {
    public static void main(String[] args) {
        long a=1324121321L;
        int b=100;
        short c=1;
        char d=3;

        //多种类的数值型变量相加，如果有Long类型，结果就是long类型。
        //如果没有long类型数值参与，那么结果都是int类型
        System.out.println(a+b+c+d); //结算结果是long类型
        System.out.println(b+c+d);//结果是int类型
        System.out.println(c+d);//结果是int类型



    }
}
