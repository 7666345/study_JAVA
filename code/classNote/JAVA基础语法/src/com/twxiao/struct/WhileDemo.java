package com.twxiao.struct;

public class WhileDemo {
    public static void main(String[] args) {
        //只要条件表达式不为false，while循环会一直执行。
        //应避免出现死循环（一直循环不停）

        int i=0;
        int sum=0;

        while(i<=100){
            sum=sum+i;
            i++;
        }
        System.out.println("结果是："+sum);

    }
}
