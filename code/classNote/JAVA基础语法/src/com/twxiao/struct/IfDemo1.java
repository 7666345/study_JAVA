package com.twxiao.struct;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容：");

        String t=scanner.nextLine();
        //eaquls()方法用于比较字符串是否相等。
        if(t.equals("Hello")){
            System.out.println("你输入了Hello");
        }

        scanner.close();
    }
}
