package com.twxiao.operator;  //包机制，可以方便的给文件分类存放

public class Demo1 {
    public static void main(String[] args) {
        /*
         +,-,*,/这种只对两个数进行运算的，叫二元运算符
         进行除法运算时，要注意数据类型，最好使用float或者double而非int，避免出现运算精度问题
         */
        int a=10;
        int b=20;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);  //两个int相除，输入结果为0，精度有问题。
        /*
        此处由于是两个int类型整数相除，产生的结果也是int类型。
        正确的结果应为0.5，但是被转换成int型整数的0，精度不准，计算错误。
        所以，在做除法是应使用float或者double浮点类型，提高精度。
        */
        System.out.println((float)a/b);
    }
}
