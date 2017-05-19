package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/15.
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * Example:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Input: "cbbd"
 * Output: "bb"
 * Input: "babad"
 */
public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        char[] c = s.toCharArray();
        int k = 0;
        int max = 0;
        for(int i = 0;i < c.length;i++){
            int len = 0;
            for(int j = 0;j <= i && i + j < c.length;j++){
                if(c[i - j] == c[i + j]){
                    len++;
                }
            }
            if(len > max){
                max = len;
                k = i;
            }
        }
        System.out.println("k="+k+",max="+max);
        return s.substring(k - max + 1, k + max);
    }
    public static void main(String[] args){
        String s = "cabccba" ;
        System.out.println(longestPalindrome(s));
        System.out.print(3%7);
    }
}
