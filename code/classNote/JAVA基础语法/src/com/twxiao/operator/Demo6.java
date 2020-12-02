package com.twxiao.operator;
//逻辑运算
public class Demo6 {
    public static void main(String[] args) {
        /*
        与 &&--AND--a && b : 当 a和b都为true是，结果才为true
        或 ||--OR-- a || b ： a 或者 b有一个为true，结果就为true
        非 ！--取反值-- ！（a&&b）：当 a && b 的值为true时，结果为false，反之亦然。
         */

        boolean a=true;
        boolean b=false;

        System.out.println("a&&b="+(a && b));
        System.out.println("a||b="+(a || b));
        System.out.println("!(a&&b)="+!(a&&b)); //取反值， a&&b为false，取反值为true。

        /*
        短路运算：
            a && b ,当 a的值为false时，系统即可直接判断结果为false，后面b的表达式不会执行运算。
         */
        int c=3;
        boolean d=(c>5)&&(c++ == 4);

        System.out.println("d="+d); // 逻辑与运算中，c>5已经为false，系统直接返回false，后面的 c++ ==4 并未执行
        System.out.println(c); //因为短路运算，c++没有被执行所以c依然为3
    }
}
