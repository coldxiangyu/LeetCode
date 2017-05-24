package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/19.
 */
public class FirstUniqChar {
    // this is my thougth witch is Time Limit Exceeded
    public static int firstUniqChar(String s) {
        char[] str = s.toCharArray();
        for(int i = 0;i < str.length;i++){
            if(s.replace(String.valueOf(str[i]),"").length() + 1 == s.length()){
                return i;
            }
        }
        return -1;
    }
    //不成熟的想法  考虑"cc"这种字符串
   /* public static int firstUniqChar2(String s){
        char[] str = s.toCharArray();
        for(int i = 0;i < str.length;i++){
            System.out.println(s.substring(i + 1)+","+str[i]);
            if(!s.substring(i + 1).contains(String.valueOf(str[i]))){
                return i;
            }
        }
        return -1;
    }*/
    public static int firstUniqChar2(String s) {
        int[] freq = new int[26];
        for(int i = 0;i < s.length();i++){
            freq[s.charAt(i) - 'a'] ++ ;
        }
        for(int i = 0;i < s.length();i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(firstUniqChar2("loveleetcode"));
    }
}
