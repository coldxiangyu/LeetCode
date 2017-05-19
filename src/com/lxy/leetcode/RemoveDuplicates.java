package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/16.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/#/description
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums) {
            System.out.println("i="+i);
            System.out.println("n=" + n + ",nums=" + nums[i - 1]);
            if (n > nums[i - 1])
                nums[i++] = n;
        }
        return i;
    }
    public static int removeDuplicates2(int[] nums) {

        int length = nums.length;
        int current = 0;
        int unique = 0;

        if(nums.length > 0){
            current = nums[0];

            for(int i = 1; i < nums.length; i++){
                if(nums[i] == current){
                    length --;
                }else{
                    unique ++;
                    current = nums[i];
                    nums[unique] = current;
                }
            }
        }
        return length;
    }


    public static void main(String[] args){
        int data[] = {122, 122, 222};
        System.out.println(removeDuplicates2(data));
        for(int i = 0;i < data.length;i++){
            System.out.println(data[i]);
        }
    }
}
