package com.twxiao.operator;
//扩展运算符
public class Demo8 {
    public static void main(String[] args) {

        /*
        自增自减符号
        a+=b ------  a = a+b
        a-=b ------ a = a-b
         */

        int a=10;
        int b=20;
        int c=30;

        a+=b; // a=a+b;--- a= 10 + 20
        a-=b; // a=a-b;--- a= 30 - 20
        System.out.println(a);

        /*
        字符串连接符号：
        面试题扩展： 关于字符串连接符“ + ”
            加号可用于连接变量值与字符串，有拼接效果。
            需要注意字符串所处位置不同，结果不同。
         */
        System.out.println(""+a+b); // 字符串在最前面，a+b不执行加法运算，直接输出 1020
        System.out.println(a+b+""); // 字符串在最后面，字符串前面的 a+b执行加法运算，输出 30
        System.out.println(a+b+""+c+a);// 字符串在中间，字符串前面的运算可执行，字符串后的运算不执行，输出 303010

        /*
        三元运算符
        X?Y:Z ----如果X为true，结果为Y，否则结果为Z
         */
        int score=79;
        String pingfen =score >60?"及格":"不及格"; //如果score大于60，想变量pingfen赋值“及格”，如果不大于60，则赋值“不及格”

        System.out.println(pingfen);
    }
}
