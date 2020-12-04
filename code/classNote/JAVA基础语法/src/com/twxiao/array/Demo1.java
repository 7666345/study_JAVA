package com.twxiao.array;

public class Demo1 {
    public static void main(String[] args) {
        /*
        数组：
        多个同一数据类型的有序排列的集合。
         */

        int[] nums=new int[10];//声明了一个int类型，长度为10的数组。

        //可以根据数组元素的下标志来进行访问
        nums[0]=1; //数组下标从0开始
        nums[1]=2;
        nums[2]=3;
        //数组元素如果没有赋值，其默认值与数据类型的默认值一致。

        //System.out.println(nums.length); //通过数组的.length属性可以获取数据的长度

        //通过增强型for循环，可以方便的遍历数组
        int sum=0;
        for (int x:nums){//x必须指定数据类型
            sum+=x;
        }

        System.out.println(sum);

    }
}
