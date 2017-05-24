package com.lxy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by coldxiangyu on 2017/5/23.
 * 442. Find All Duplicates in an Array
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/#/description
 */
public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i = 1;i < nums.length;i++){
            if(nums[i] == nums[i - 1]){
                list.add(nums[i]);
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
    }
}
