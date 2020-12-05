package com.twxiao.array;

public class Demo2 {
    public static void main(String[] args) {

        /*
        数组声明方式：

        1. 静态声明：声明和赋值同时进行，长度和内容固定；
         */

        int[] a={1,2,3,4,5};

        //动态声明
        int[] b=new int[5];//声明数组，并在内存开辟空间
        b[0]=1;
        b[1]=2;//给元素赋值


        // 方式3
        int[] c;  //在内存栈中存放 数组名字c
        c=new int[5];//在内存堆中开辟对应的空间。此时数组元素只有默认值。
        c[0]=1; //给数组中的元素赋值。

    }
}
