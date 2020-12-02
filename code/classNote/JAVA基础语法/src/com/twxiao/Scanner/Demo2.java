package com.twxiao.Scanner;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //使用NextLine()方法获取用户输入
        if(scanner.hasNextLine()){
            /*
            用nextLine()方法获取用户输入：
            nextLine()方法以输入内容中的回车符号作为结束标志。
            可以接收到用户输入的空格
             */
            String nowContent=scanner.nextLine();
            System.out.println(nowContent);
        }
        scanner.close();//操作完毕，关闭IO流。

    }
}
