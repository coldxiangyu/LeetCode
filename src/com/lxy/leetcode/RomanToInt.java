package com.lxy.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by coldxiangyu on 2017/5/16.
 * 13. Roman to Integer
 * https://leetcode.com/problems/roman-to-integer/#/description
 */
public class RomanToInt {
    public static int romanToInt(String s) {
        Map<Character, Integer> romeToNatural = new HashMap<Character, Integer>();
        romeToNatural.put('I', 1);
        romeToNatural.put('V', 5);
        romeToNatural.put('X', 10);
        romeToNatural.put('L', 50);
        romeToNatural.put('C', 100);
        romeToNatural.put('D', 500);
        romeToNatural.put('M', 1000);

        int total = 0, prevValue = 0;
        for(int i = 0; i < s.length(); ++i) {
            Integer value = romeToNatural.get(s.charAt(i));
            if(value <= prevValue)
                total += value;
            else
                total += value - 2 * prevValue;
            prevValue = value;
        }

        return total;
    }
    public static int romanToInt2(String s) {
        int sum=0;
        if(s.indexOf("IV")!=-1){sum-=2;}
        if(s.indexOf("IX")!=-1){sum-=2;}
        if(s.indexOf("XL")!=-1){sum-=20;}
        if(s.indexOf("XC")!=-1){sum-=20;}
        if(s.indexOf("CD")!=-1){sum-=200;}
        if(s.indexOf("CM")!=-1){sum-=200;}

        char c[]=s.toCharArray();
        int count=0;

        for(;count<=s.length()-1;count++){
            if(c[count]=='M') sum+=1000;
            if(c[count]=='D') sum+=500;
            if(c[count]=='C') sum+=100;
            if(c[count]=='L') sum+=50;
            if(c[count]=='X') sum+=10;
            if(c[count]=='V') sum+=5;
            if(c[count]=='I') sum+=1;

        }

        return sum;

    }
    public static int romanToInt3(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    res += (res >= 5 ? -1 : 1);
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    res += 10 * (res >= 50 ? -1 : 1);
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'C':
                    res += 100 * (res >= 500 ? -1 : 1);
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'M':
                    res += 1000;
                    break;
            }
        }
        return res;
    }
    public static int romanToInt4(String s) {
        int graph[] = new int[400];
        graph['I'] = 1;
        graph['V']=5;
        graph['X']=10;
        graph['L']=50;
        graph['C']=100;
        graph['D']=500;
        graph['M']=1000;
        char[] num = s.toCharArray();
        // 遍历这个数，用sum来总计和
        int sum = graph[num[0]];
        for(int i=0; i<num.length-1; i++){
            // 如果，i比i+1大的话，直接相加
            if(graph[num[i]] >= graph[num[i+1]]){
                sum += graph[num[i+1]];
            }
            // 如果i比i+1小的话，则将总和sum减去i这个地方数的两倍，同时加上i+1
            // 就相当于后边的数比左边的数大，则用右边的数减左边的数
            else{
                sum = sum + graph[num[i+1]] - 2*graph[num[i]];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(romanToInt("IV"));
    }
}
