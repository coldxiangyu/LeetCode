package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/6/22.
 */
public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        if(target <= nums[0]) return index;
        if(target > nums[nums.length - 1]) return nums.length;
        for(int i = 0;i < nums.length - 1;i++){
            if(target >= nums[i] && target <= nums[i + 1]){
                index = i + 1;
                break;
              }
         }
        return index;
    }
    public int searchInsert2(int[] nums, int target) {
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            if(target <= nums[i]){
                res = i;
                return res;
            }
        }
        return nums.length;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,5,5,6};
        System.out.println(searchInsert(nums,5));
    }
}
