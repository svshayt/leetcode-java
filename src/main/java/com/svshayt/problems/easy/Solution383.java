package com.svshayt.problems.easy;

public class Solution383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] countLetter = new int[26];
        for (char c : magazine.toCharArray()) {
            int index = Character.toLowerCase(c) - 'a';
            countLetter[index]++;
        }
        for (char c : ransomNote.toCharArray()) {
            int index = Character.toLowerCase(c) - 'a';
            countLetter[index]--;
            if (countLetter[index] < 0) return false;
        }
        return true;
    }
}
