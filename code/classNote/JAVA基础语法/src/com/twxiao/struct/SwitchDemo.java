package com.twxiao.struct;

public class SwitchDemo {
    public static void main(String[] args) {
        String name="京东";
        switch(name){
            case "苏宁":
                System.out.print("suning");
                break; //如果不加break，会出现case穿透bug
            case "京东":
                System.out.print("JD");
                break;
            case "国美":
                System.out.print("Gome");
                break;
            default:
                System.out.print("没有匹配的内容");
        }
    }
}
