package com.twxiao.Scanner;
import java.util.Scanner; //引入Scanner类

public class Demo1 {
    public static void main(String[] args) {
        //实例化Scanner类，接收用户输入
        Scanner scanner = new Scanner(System.in);
        //用hasNext()或hasNextLine()判断用户是否输入了数据
        if(scanner.hasNext()){
            /*
            使用next方法接收用户输入：
            next方法接收数据时，把输入文字后面的空格当做结束标志，空格后的内容不予获取、输出。--输入“HELLO WORLD”输出：HELLO
            输入有效文字之前如果有空格，next()方法会自动将空格去除。--输入“   HELLO,WORLD”输出：HELLO,WORLD
             */
            String nowContent=scanner.next();
            System.out.println(nowContent);
        }

        scanner.close();//用完一定要关闭


    }
}
