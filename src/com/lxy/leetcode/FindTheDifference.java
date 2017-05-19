package com.lxy.leetcode;

import java.util.Arrays;

/**
 * Created by coldxiangyu on 2017/5/18.
 * 389. Find the Difference
 * https://leetcode.com/problems/find-the-difference/#/description
 */
public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        char[] str = s.toCharArray();
        char[] ttr = t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(ttr);
        for(int i = 0;i < str.length;i++){
            if(str[i] != ttr[i]){
                return ttr[i];
            }
        }
        return ttr[t.length()-1];
    }
    public static char findTheDifference2(String s, String t) {
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            ret -= (int)s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            ret += (int)t.charAt(i);
        }
        return (char)ret;
    }
    public static char findTheDifference3(String s, String t) {
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            ret ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            ret ^= t.charAt(i);
        }
        return (char)ret;
    }
    public static void main(String[] args){
        String s = "abbcd";
        String t = "abebcd";
        System.out.println(findTheDifference3(s, t));
    }
}
