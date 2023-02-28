package com.svshayt.problems.easy;

import java.util.Arrays;

public class Solution724 {

    public int pivotIndex(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = Arrays.stream(nums).sum();
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum - nums[i] == leftSum) {
                return i;
            } else {
                sum -= nums[i];
                leftSum += nums[i];
            }
        }
        return -1;
    }
}
