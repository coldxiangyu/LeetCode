package com.lxy.leetcode;

import java.util.Arrays;

/**
 * Created by coldxiangyu on 2017/5/23.
 * 268. Missing Number
 * https://leetcode.com/problems/missing-number/#/description
 */
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++){
            if(i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }
    public static int missingNumber2(int[] nums) {
        int xor = 0,i = 0;
        for(i = 0;i < nums.length;i++){
            xor ^= nums[i] ^ i;
        }
        return xor ^ i;
    }
    public static void main(String[] args){
        int[] nums = {0,1,2,3,5,4,7};
        System.out.println(missingNumber2(nums));
    }
}
