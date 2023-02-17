package com.svshayt.problems.easy;

import java.util.Arrays;

public class Solution1337 {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] values = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            values[i] = Arrays.stream(mat[i]).sum() * mat.length + i;
        }
        Arrays.sort(values);
        int[] res = Arrays.copyOfRange(values, 0, k);
        res = Arrays.stream(res).map(i -> i % mat.length).toArray();
        return res;
    }
}
