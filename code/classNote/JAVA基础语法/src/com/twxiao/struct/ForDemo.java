package com.twxiao.struct;

public class ForDemo {

    public static void main(String[] args) {
        //for循环联系1：计算0--100间，奇数和偶数的和。
        int oddsum=0;
        int evensum=0;

        for (int i = 0; i <= 100; i++) { // 输入100.for+回车，快速写出循环结构
            //判断当前数是奇数还是偶数，分别保存到对应的变量
            if(i % 2 != 0){
                oddsum+=i; // oddsum+=i;-----> oddsum=oddsum+i;
            }else{
                evensum+=i;
            }
        }
        System.out.println(oddsum);
        System.out.println(evensum);

        System.out.println("------------------------");

        /*
        for循环练习2：
        1-1000之间能被5整除的数，没3个数为一行排列
         */


        for (int i = 1; i <= 1000; i++) {

            if(i%5==0){
                System.out.print(i+",");
                if(i%3==0){
                    System.out.print("\n");
                }
            }

        }

        System.out.println("---------------");

        /*
        for循环联系3：
        99乘法表
         */

        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j+" X"+i+" = "+(i*j)+"\t");

            }
            System.out.print("\n");

        }

    }
}
