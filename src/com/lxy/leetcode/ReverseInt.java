package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/12.
 */

/**
 * Description:
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * click to show spoilers.
 * Note:
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 * */
public class ReverseInt {
    private static int reverse(int x){
        int result = 0;
        boolean b = true ;
        if(x < 0){
            b = false;
        }
        x = java.lang.Math.abs(x);
        String s = x + "";
        char[] c = s.toCharArray();
        String str = "";
        for(int i = c.length - 1;i >= 0;i--){
            str += c[i];
        }
        if(!b){
            str = "-"+str;
        }
        try {
            result = Integer.parseInt(str);
        }catch(Exception e){
            result = 0;
        }
        return result;
    }
    public static int reverse2(int x) {

        long reversedNum = 0;

        long input_long = x;

        while (input_long != 0)
        {
            reversedNum = reversedNum * 10 + input_long % 10;
            input_long = input_long / 10;
        }

        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE)
        {
            return 0;
        }
        return (int)reversedNum;

    }
    public static int reverse3(int x) {
        long rev= 0;
        while( x != 0){
            System.out.println("first="+rev);
            rev= rev*10 + x % 10;
            System.out.println("last="+rev);
            x= x/10;
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int) rev;
    }
    public static void main(String[] args){
        System.out.print(reverse3(1234));
    }
}
