package com.lxy.leetcode;

/**
 * Created by coldxiangyu on 2017/5/15.
 */

/**
 * description
 * Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 * For example,
 * Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 * Therefore, return the max sliding window as [3,3,5,5,6,7].
 * Note:
 * You may assume k is always valid, ie: 1 ≤ k ≤ input array's size for non-empty array.
 *
 * */
public class MaxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = 0;
        if(nums.length > 0){
            n = nums.length - k + 1;
        }
        int[] temp = new int[n];
        if(1 <= k  && k <= nums.length){
            temp = new int[n];
            for(int i = 0;i < n;i++){
                int max = nums[i];
                for(int j = i;j < i + k;j++){
                    if(nums[j] > max){
                        max = nums[j];
                    }
                }
                temp[i] = max;
            }
        }
        return temp;
    }
    public static void main(String[] args){
        int nums[] = {1};
        int[] slid = maxSlidingWindow(nums, 1);
        for(int k = 0;k < slid.length;k++){
            System.out.print(slid[k]+" ");
        }

    }
}
