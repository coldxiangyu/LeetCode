package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/23.
 * 504. Base 7
 * https://leetcode.com/problems/base-7/#/description
 */
public class Base7 {
    //simpile way of java
    public static String convertToBase7(int num) {
        return Integer.toString(num,7);
    }
    public static String toBase7(int num){
        if(num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        int n = Math.abs(num);
        while(n != 0){
            sb.append(n % 7);
            n = n / 7;
        }
        return (num < 0 ? "-" : "") + sb.reverse().toString();
    }
    //good way to try ,and easy understand
    public static String turnBase7(int num){
        if (num < 0)
            return '-' + turnBase7(-num);
        if (num < 7)
            return num + "";
        return turnBase7(num / 7) + num % 7;
    }
    public static void main(String[] args){
        System.out.println(convertToBase7(-50));
    }
}
