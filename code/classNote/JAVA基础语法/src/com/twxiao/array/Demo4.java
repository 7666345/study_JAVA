package com.twxiao.array;

import java.net.SocketTimeoutException;

public class Demo4 {

    public static void main(String[] args) {
        /*
        多维数组:数组元素也是数组，数组中嵌套数组
        int[][] nums={{1,2,3},{4,5,6}};

        nums[0]={1,2,3}
        nums[1]={4,5,6}
         */

        int[][] nums={{1,2,3},{4,5,6}};

        //打印所有数组元素
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("nums["+i+"]["+j+"]="+nums[i][j]);
            }
        }


    }
}
