package com.twxiao.method;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork {
    /*
    简易计算器，实现加减乘除运算。
     */

    static int userChooice=0;//算法

    static ArrayList jisuan=new ArrayList();

    public static void main(String[] args) {

        HomeWork homeWork = new HomeWork();
        double userResult=homeWork.userChooice();
        System.out.println("最终结果为:"+userResult);



    }
    public double userChooice(){

        //让用户输入两个计算数字
        System.out.println("请输入【第1个】数字:");
        Scanner input1 = new Scanner(System.in);
        double num1=input1.nextDouble();

        System.out.println("请输入【第2个】数字:");
        Scanner input2 = new Scanner(System.in);
        double num2=input2.nextDouble();

        double result=0;

        System.out.println("开始计算，请选择需要的算法:\n【1】：加法运算；\n【2】：减法运算；\n【3】：乘法运算；\n【4】：除法运算");

        //Scanner获取用户输入
        Scanner suanfa = new Scanner(System.in);
        int myChooice=0;
        if(suanfa.hasNextInt()){
            myChooice=suanfa.nextInt();
        }

        //所有的用户输入都已经完成，才可以关闭IO流，不然系统报错
        input1.close();
        input2.close();
        suanfa.close();

        switch (myChooice){
            case 1:
                System.out.println("你选择了：【加法运算】");
                result=add(num1,num2);
                return result;
            case 2:
                System.out.println("你选择了：【减法运算】");
                result=sub(num1,num2);
                return result;
            case 3:
                System.out.println("你选择了：【乘法运算】");
                result=mul(num1,num2);
                return result;
            case 4:
                System.out.println("你选择了：【除法运算】");
                result=div(num1,num2);
                return result;
            default:
                System.out.println("【输入错误,只允许输入数字 1-4】");
                userChooice();
        }



        return result;

    }



    public static double add(double a,double b){
        return a+b;
    }

    public static double sub(double a,double b){
        return a-b;
    }

    public static double mul(double a,double b){
        return a*b;
    }

    public static double div(double a, double b){
        return a/b;
    }
}
