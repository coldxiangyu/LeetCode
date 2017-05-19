package com.lxy.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by coldxiangyu on 2017/5/18.
 * 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/#/description
 */
public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] str = s.toCharArray();
        char[] ttr = t.toCharArray();
        HashMap<Character, Integer> smap = getMap(str);
        HashMap<Character, Integer> tmap = getMap(ttr);
        return smap.equals(tmap);
    }
    public static HashMap<Character,Integer> getMap(char[] str){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0;i < str.length;i++){
            if(map.containsKey(str[i])){
                map.put(str[i],map.get(str[i])+1);
            }else{
                map.put(str[i],1);
            }
        }
        return map;
    }
    public static boolean isAnagram2(String s, String t) {
        char[] str = s.toCharArray();
        char[] ttr = t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(ttr);
        return Arrays.equals(str,ttr);
    }
    public static void main(String[] args){
        String s = "";
        String t = "";
        System.out.println(isAnagram2(s, t));
    }
}
