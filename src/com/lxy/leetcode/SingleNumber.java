package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/18.
 * 136. Single Number
 * https://leetcode.com/problems/single-number/#/description
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int temp = 0;
        for(int i = 0;i < nums.length;i++){
            temp ^= nums[i];
        }
        return temp;
    }
    public static void main(String[] args){
        int[] numbers = {2,1,3,2,1};
        System.out.println(singleNumber(numbers));
    }
}
