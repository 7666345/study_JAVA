package com.twxiao.array;

import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {

        int[] nums={34,786,1,0,6546,234234,23};

        int[] sortResult=mySort(nums);
        System.out.println(Arrays.toString(sortResult)); //调用Arrays工具类的toString方法显示数组元素。

    }

    /**
     * 冒泡排序
     * @param myArrays
     * @return
     */
    public static int[] mySort(int[] myArrays){
        int tmp=0;//用于交换数组元素时，存放临时数据。
        //外层循环控制冒泡排序比较的次数
        for (int i = 0; i < myArrays.length-1; i++) {
            for (int j = 0; j < myArrays.length-1-i; j++) {
                //比较相邻的两个元素，如果后面的元素比前面的大，则交换位置。（降序排列，如升序则相反）
                if(myArrays[j+1]>myArrays[j]){
                    tmp=myArrays[j];
                    myArrays[j]=myArrays[j+1];
                    myArrays[j+1]=tmp;
                }
            }
        }
        return myArrays;
    }


}
