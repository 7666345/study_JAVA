package com.twxiao.exception.demo1;

public class Test {

    public static void main(String[] args) {
        new Test().add(1,0);
    }




    public  float add(int a, int b){

        //还可以用throw在方法中主动抛出异常
        if(b==0){
            throw ArithmeticException;
        }

        float result=0;
        try {
            //选中需要监控异常的代码，ctrl + alt + t，可以快速包裹代码。
            result=a/b; //b不能为0，客户可能会传个0进来，所以要监控一下是否回出现此状况。
        } catch (Exception e) {
            System.out.println("已经捕获到异常");
            e.printStackTrace();//打印捕获到的异常
        } finally {
            //finally不管有无异常，最后都会执行。一般用于善后工作，不是必须存在的。
            System.out.println("最后都会执行finally中的操作。");
        }
        return result;
    }
}
