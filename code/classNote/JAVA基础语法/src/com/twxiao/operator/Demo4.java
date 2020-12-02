package com.twxiao.operator;

public class Demo4 {
    public static void main(String[] args) {
        //一元运算符 ++（自增） ，  --（自减）

        int a=3;

        /*
          a++和 ++a都是 对变量a执行+1操作：
            b=a++：先把a原有的值赋值给b，然后a执行+1操作。
            b=++a：a先执行+1操作，然后把最新的结果赋值给b。
        * */

        int b=a++;  // 把a的变量值3赋给b，然后a执行+1操作，变成4。a=4，b=3.
        int c=++a;  // a（值是4）先执行+1操作变成5，然后把5赋值给c。 a=5, c=5

        System.out.println(a); //a经过2次自增，由3变5
        System.out.println(b); //b被赋值为a最初的变量值3
        System.out.println(c); //c被赋值为a经过两次+1的结果5
    }
}
