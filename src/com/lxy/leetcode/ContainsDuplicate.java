package com.lxy.leetcode;

import java.util.Arrays;

/**
 * Created by coldxiangyu on 2017/5/23.
 * 217. Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/#/description
 */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1;i < nums.length;i++){
            if(nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}
