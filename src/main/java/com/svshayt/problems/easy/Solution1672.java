package com.svshayt.problems.easy;

public class Solution1672 {

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum = sum + i;
            }
            if (sum > max) max = sum;
        }
        return max;
    }
}
