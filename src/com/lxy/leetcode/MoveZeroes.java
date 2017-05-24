package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/19.
 * 283. Move Zeroes
 * https://leetcode.com/problems/move-zeroes/#/description
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
    public static void main(String args[]){
        int[] nums = {0,0,1,2,3};
        moveZeroes(nums);
        for(int i = 0;i < nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
