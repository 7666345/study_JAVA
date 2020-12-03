package com.twxiao.struct;

public class TestDemo {
    public static void main(String[] args) {

        /*打印三角形

        1. 把三角形对折后，放到一个方形里面来理解，
        2. 每一行都是由方形的空白出+三角形的实现组成
        3. 空白递减，实线递增，最终打印出三角形
         */

        for (int i = 1; i <= 10; i++) {
            //打印空白
            for (int j = 10; j >= i; j--) {
                System.out.print(" ");
            }
            //打印三角形的左半边
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //打印三角形的右半边
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            //每打印完一行，需要换行继续下一行的打印
            System.out.println();

        }

    }
}
