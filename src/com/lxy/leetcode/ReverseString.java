package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/18.
 * 344. Reverse String
 * https://leetcode.com/problems/reverse-string/#/description
 */
public class ReverseString {
    public static String reverseString(String s) {
        StringBuffer str = new StringBuffer();
        for(int i = s.length() - 1;i >= 0;i--){
            str.append(s.charAt(i));
        }
        return str.toString();
    }
    public static String reverseString2(String s) {
        char[] str = s.toCharArray();
        int i = 0;
        int j = str.length - 1;
        while(i < j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return new String(str);
    }
    public static void main(String[] args){
        System.out.println(reverseString2("hello"));
    }
}
