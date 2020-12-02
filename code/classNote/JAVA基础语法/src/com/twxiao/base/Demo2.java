package com.twxiao.base;

public class Demo2 {
    public static void main(String[] args) {
        /*
        类型转换： 不同数据类型的变量，运算时一定要先转换为同一类型，才可以运算。
          1. 自动转换，数据类型由低向高转换时，会自动转换
          2. 强制转换，当数据类型由高向低转换时，才需要强制转换。
          ----------------
          数据类型由低到高：
          byte,short,char----int---long---float---double
         */


        //强制转换： 目标类型 变量名=（目标类型）变量1
        // int等级高于byte，强制转换时可能会遇到内存溢出等错误。（byte类型接受的最大值为127，此处强行将128转化为byte类型就会内存溢出）
        int num1=128;
        byte num2=(byte)num1;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("----------------------");

        //把高等级的float类型转为int类型，就会出现精确度不准的问题。从3.1458转成了3
        float numf=3.1458f;
        int nf=(int)numf;

        System.out.println(numf);
        System.out.println(nf);
        System.out.println("----------------------");


        //自动转换： 数据类型从低向高转换，无须特殊操作，直接转换即可。（高级的数据类型兼容性更高）

        long num3=num1;

        System.out.println(num3);
        System.out.println("----------------------");

        //char也可以理解为数值型
        char c='a'; //char类型的变量c，的值‘a’，对应ascII码中的 数字97
        // 类型不同，运算前需要先转为同一类型：把char类型转成更高级的int类型，所以自动转换，无须强制。
        //char类型的a会转成int类型的值即a对应的ASCII码--97
        //转换成int类型后，才会进行+1操作，所以int类型变量d的值是 98
        int d=c+1;
        System.out.println(d);

         //此时如果把 d转换成 char类型
        System.out.println((char)d);//int类型的98对应ASCII码中的字母b






    }
}
