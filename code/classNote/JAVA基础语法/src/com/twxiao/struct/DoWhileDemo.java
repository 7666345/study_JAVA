package com.twxiao.struct;

public class DoWhileDemo {


    public static void main(String[] args) {
    /* do...while循环：
    先执行一次循环体的内容，然后再判断条件，如条件成立，则继续执行循环体。

    do...while与while最大区别：
    do...while至少会执行一次，而while循环如果条件不成立，一次都不执行。
    */
        int a=0;

        while(a>0){
            System.out.println("a"); //因while条件不成立，所以并未执行。
        }

        System.out.println("==============");

        do{
            System.out.println("a");//先执行一次，然后在判断while条件，因条件不成立，停止执行。
        }while(a>0);
    }


}
