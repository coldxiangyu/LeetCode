package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/17.
 * 461. Hamming Distance
 * https://leetcode.com/problems/hamming-distance/#/description
 */
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
    public static int hammingDistance2(int x, int y) {
        int c = x ^ y;
        int i=0;
        while(c >0){
            if((c & 1) == 1)
                i++;
            c = c >> 1;
        }
        return i;
    }
    public static int hammingDistance3(int x, int y) {
        int i = 0;
        int temp = x ^ y;
        while (temp != 0) {
            i++;
            temp &= temp - 1;
        }
        return i;
    }
    public static void main(String[] args){
        System.out.println(hammingDistance2(1,4));
        System.out.println(1&4);
    }
}
