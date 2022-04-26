package com.hy.day5;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        boolean answer = Solution.containsNearbyDuplicate(nums, k);
        System.out.println(answer);
    }
}
