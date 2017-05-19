package com.lxy.leetcode;


/**
 * Created by coldxiangyu on 2017/5/16.
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/#/description
 * 我的思路：回文数字正序倒序相等
 */
public class IntPalindrome {
    public static boolean isPalindrome(int x) {
        int temp = x ;
        boolean flag = false;
        int rev = 0;
        while(x > 0){
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        if(temp == rev) {
            flag = true;
        }
        return flag;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(123321));
    }
}
