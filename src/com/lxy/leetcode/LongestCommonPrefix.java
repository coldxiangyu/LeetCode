package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/17.
 * 14. Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/#/description
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++)
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
        return pre;
    }
    public static String longestCommonPrefix2(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String temp = strs[0] ;
        for(int i = 0;i < strs.length;i++){
            while(strs[i].indexOf(temp) != 0){
                temp = temp.substring(0,temp.length() - 1);
            }
        }
        return temp;
    }
    public static void main(String[] args){
        String[] str = {"strb","string","strsdf","strsdfs"};
        System.out.println(longestCommonPrefix2(str));
    }
}
