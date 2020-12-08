package com.twxiao.array;

public class Demo3 {
    public static void main(String[] args) {

        int[] nums={1,2,3,4,5};

        //数组打印（for-each）
        for (int num : nums) {
            System.out.println(num+"   ");
        }

        System.out.println("----------------");

        //数组作为参数调用方法
        int[] reArray=reversArray(nums);

        //打印返回的数组
        for (int rever : reArray) {
            System.out.println(rever+" ");
        }


    }

    public static int[] reversArray(int[] array){
        //for循环翻转nums数组
        int[] revers=new int[array.length];
        for (int i=0,j=revers.length-1; i < array.length; i++,j--) {
            revers[j]=array[i];
        }

        return revers;
    }
}
