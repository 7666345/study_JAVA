package com.twxiao.struct;

import java.util.Scanner;

public class IfDemo2 {
    //if--else结构
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的成绩：");
        float score=scanner.nextFloat();

        if(score>60){
            System.out.println("你及格了");
        }else{
            System.out.println("你不及格");
        }

        scanner.close();
    }
}
