package com.twxiao.Scanner;

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        double sum=0.0;
        int i=0;

        while(s.hasNextDouble()){ //循环获取用户输入的数字，如果用户输入非数字，停止继续获取
            double x=s.nextDouble();
            sum=sum+x; //计算每次输入数字的和
            i++; //计算输入数字的个数
        }

        //（）包裹的优先级更高，所以sum/i会执行运算，而非直接输出。
        System.out.println("共输入了"+i+"个数字，和是："+sum+"；平均值为："+(sum/i));

        s.close();
    }
}
