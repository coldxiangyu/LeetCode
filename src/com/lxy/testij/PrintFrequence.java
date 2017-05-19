package com.lxy.testij;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by coldxiangyu on 2017/5/18.
 */
public class PrintFrequence {
    public static void printFreq(char[] str){
        int[] freq = new int[256];
        for(int i = 0;i < str.length;i++){
            freq[str[i]]++;
        }
        for(int j = 0;j < freq.length;j++){
            if(freq[j] > 0) {
                System.out.println("[" + (char)(j) + "]"+freq[j]);
            }
        }
    }
    public static void printFreq2(char[] str){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0;i < str.length;i++){
            if(map.containsKey(str[i])){
                map.put(str[i], map.get(str[i])+1);
            }else{
                map.put(str[i], 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("[" + (char)(entry.getKey()) + "] = " + entry.getValue());
        }
    }
    public static void main(String[] args){
        String str = "◣⚽◢⚡◣⚾⚡◢" ;
        printFreq2(str.toCharArray());
    }
}
