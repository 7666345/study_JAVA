package com.twxiao.method;

public class Demo4 {
    public static void main(String[] args) {

        Demo4  d4 = new Demo4();

        int result=d4.f(5);
        System.out.println(result);

    }

    /*
    递归：方法调用方法自身
        递归包含2部分：
        1. 递归头： 规定什么时候结束调用
        2. 递归体： 规定什么时候需要调用自身
     */

    //实现阶乘的递归算法： 3的阶乘就是 3X2X1，以此类推

    public int f(int n){
        if(n==1){
            return 1;  //1的阶乘为1，直接返回结果（递归头）
        }else{
            return n*f(n-1);  //递归体
        }
    }
}
