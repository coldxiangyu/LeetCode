package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/22.
 * 371. Sum of Two Integers
 * https://leetcode.com/problems/sum-of-two-integers/#/description
 */
public class SumTwoIntegers {
    public static int getSum(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        while(b != 0){
            int c = a & b ;
            a = a ^ b;
            b = c << 1;
        }
        return a;
    }
    public static void main(String[] args){
        System.out.println(getSum(2,3));
    }
}
