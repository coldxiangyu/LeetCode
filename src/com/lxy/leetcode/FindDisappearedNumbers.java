package com.lxy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by coldxiangyu on 2017/5/19.
 */
public class FindDisappearedNumbers {
    //this method cost much time
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i <= nums.length;i++){
            int temp = 0;
            for(int j = 0;j < nums.length;j++){
                if(nums[j] == i){
                    temp++;
                }
            }
            if(temp == 0){
                list.add(i);
            }
        }
        return list;
    }
    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i < nums.length;i++){
            int temp = nums[i];
            if(nums[Math.abs(temp) - 1] > 0){
                nums[Math.abs(temp) - 1] = - nums[Math.abs(temp) - 1];
            }
        }
        for(int j = 1;j <= nums.length;j++){
            if(nums[j - 1] > 0){
                list.add(j);
            }
        }
        return list;
    }
    public static List<Integer> findDisappearedNumbers3(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int n[] = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++){
            n[nums[i]]++;
        }

        for(int i = 1; i <= nums.length; i++){
            if(n[i] == 0){
                res.add(i);
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers2(nums));
    }
}
