package com.twxiao.base;

public class Demo3 {
    public static void main(String[] args) {
        //JDK7有新特性，可以给特别大的数字加下划线，方便区分
        int n1=10_0000_0000; //等同于 n1=1000000000;
        int n2=20;


        int n3=n1*n2;
        long n4=n1*n2;
        long n5=(long)n1*n2;

        /*
         计算大数字的时候，一定要注意数据类型的最大值，不然容易引起内存溢出。

         int最大值是 2 的 31次方，即 2148483647.
         当n1(10亿) X n2 的时候，结果应为200亿，大于int类型的最大值21亿，所以会内存溢出。
         */


        System.out.println(n3);//结果大于int类型值的最大范围，内存溢出
        System.out.println(n4);//由于是先计算结果然后赋值给变量，所以依然会超出int的最大值，造成内存溢出。
        System.out.println(n5);//先把n1转成long，然后计算，所以可以得出正常结果。
    }
}

