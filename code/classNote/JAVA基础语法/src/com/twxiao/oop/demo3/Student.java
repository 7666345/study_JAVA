package com.twxiao.oop.demo3;

public class Student {

    /*
    类的封装：
      1. 高内聚、低耦合。 数据操作在类内完成，不由外部干涉。仅暴露少量必要的接口给外部调用。
      2. 属性私有化（private）,属性的赋值与获取均交由公共方法get/set实现，不能直接 对象.属性名来操纵。
     */

    private String name;
    private int age;

    //快捷键 alt+ insert 可以快速生成 set/get方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //可以在方法内部增加数据合法性验证
        if(age>120 || age<0){
            this.age =3;
        }else{
            this.age = age;
        }
    }
}
