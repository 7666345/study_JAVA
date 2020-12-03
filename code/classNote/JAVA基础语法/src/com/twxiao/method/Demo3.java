package com.twxiao.method;

public class Demo3 {

    /*
    可变参数：
    可以向方法传递一个同类型的、不确定个数的参数。
    可变参数必须放在参数列表的最后。
    一个方法只允许有一个可变参数
     */

    public static void main(String[] args) {

        Demo3 demo3 = new Demo3();
        demo3.selectMax(1,2,3,4);
        System.out.println("-----------");
        demo3.selectMax(6,2,23,4);
        System.out.println("-----------");
        demo3.selectMax(199,33,53,49);


    }

    public void selectMax(int... i){
        //可变参数的本质是一个数组
        int j=0;
        for(j=0; j<i.length; j++){
            System.out.println("i["+j+"]="+i[j]);
        }

    }
}
