package com.twxiao.method;

public class Demo2 {

    public static void main(String[] args) {

        int myMax=selectMax(19,29);
        System.out.println(myMax);

        double max2=selectMax(10.2,5.321);
        System.out.println(max2);

    }

    /*方法的重载：
        类中有多个同名，但是参数不同的方法存在时，这种存在形式就是方法重载。
        当用户调用重载的方法时，编译器会根据调用时传入的参数不同，自动到多个同名方法中进行匹配，找到对应的方法。
     */

    public static int selectMax(int a, int b){
        int max=0;
        if(a==b){
            System.out.println("输入的数字相等");
            return 0;
        }

        if(a>b){
            max=a;
        }else{
            max=b;
        }

        return max; //return不仅可以返回值，还会结束方法的继续执行。

    }

    public static double selectMax(double a, double b){
        double max=0;
        if(a==b){
            System.out.println("输入的数字相等");
            return 0;
        }

        if(a>b){
            max=a;
        }else{
            max=b;
        }

        return max; //return不仅可以返回值，还会结束方法的继续执行。

    }

    public static int selectMax(int a, int b,int c){
        int max=0;
        if(a==b){
            System.out.println("输入的数字相等");
            return 0;
        }

        if(a>b){
            max=a;
        }else{
            max=b;
        }

        return max; //return不仅可以返回值，还会结束方法的继续执行。

    }
}
