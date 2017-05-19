package com.lxy.leetcode;

import java.util.Arrays;

/**
 * Created by coldxiangyu on 2017/5/17.
 * 167. Two Sum II - Input array is sorted
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/#/description
 */
public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        for(int i = 0;i < numbers.length - 1;i++){
            int j = Arrays.binarySearch(numbers, i + 1,numbers.length,target - numbers[i]);
            if(j > 0){
                return new int[]{i + 1,j + 1};
            }
        }
        return null;
    }
    public static void main(String[] args){
        int[] data = {-1,0};
        int[] res = twoSum(data,-1);
        System.out.println(res[0]+","+res[1]);
        System.out.println((111 + 111) >>> 1);
    }
}
