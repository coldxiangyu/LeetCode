package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/24.
 * 231. Power of Two
 * https://leetcode.com/problems/power-of-two/#/description
 */
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && Integer.highestOneBit(n) == Integer.lowestOneBit(n) ? true : false;
    }
    public static boolean isPowerOfTwo2(int n){
        return n > 0 && n - (n & -n) == 0;
    }
    public static void main(String[] args){
        System.out.println(Integer.toBinaryString(-3));
        System.out.println(3 & -3);
        System.out.println(isPowerOfTwo2(3));
    }
}
