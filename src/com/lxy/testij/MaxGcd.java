package com.lxy.testij;

/**
 * Created by coldxiangyu on 2017/5/12.
 */

public class MaxGcd {
    //求两数的最大公约数
    public static void main(String[] args) {
        System.out.println(gcd(24, 12));
    }

    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}