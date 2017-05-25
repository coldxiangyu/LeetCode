package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/24.
 * 66. Plus One
 * https://leetcode.com/problems/plus-one/#/description
 */
public class PlusOne {
    /**
     * my wrong answer ,too complex!!!
     * and integer will overflow
     * we'll try other way
     * */
    public static int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < digits.length; i++){
            sb.append(digits[i]);
        }
        int temp = Integer.parseInt(sb.toString()) + 1;
        String str = temp + "";
        System.out.println(str);
        char[] tem = str.toCharArray();
        int len = tem.length > digits.length ? tem.length : digits.length;
        int j = len - 1;
        int[] res = new int[len];
        for(int i = len - 1; i >= 0; i--){
            res[j] = Integer.parseInt(String.valueOf(tem[i]));
            j--;
        }
        for(; j >= 0; j--){
            res[j] = 0;
        }
        return res;
    }
    public static int[] plusOne2(int[] digits) {
        int n = digits.length;
        for(int i = n - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newnum = new int[n + 1];
        newnum[0] = 1;
        return newnum;
    }
    public static void main(String[] args){
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        int[] res = plusOne2(nums);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
