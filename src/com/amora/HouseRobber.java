package com.amora;

public class HouseRobber {
    private int getMaxInLeft(int[] res, int index) {
        if (index == 2) {
            return res[0];
        }
        return Math.max(res[index - 2], res[index - 3]);
    }
    public int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[nums.length - 1];
        }
        int[] res = new int [nums.length];
        for(int index = 0; index < nums.length; index++) {
            if (index < 2) {
                res[index] = nums[index];
            } else {
                res[index] = nums[index] + getMaxInLeft(res, index);
            }
        }
        return Math.max(res[res.length - 1], res[res.length - 2]);
    }

    public static void main(String[] args) {
        HouseRobber robber = new HouseRobber();
        //int[] nums = {2, 3, 2, 1, 1, 4};
                    //[2, 3, 4, 4, 5, 8]
        int[] nums = {1,2,3,1};
        System.out.printf("res %s", robber.rob(nums));
    }
}
