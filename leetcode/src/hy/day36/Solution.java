package hy.day36;

//747.至少是其他数字两倍的最大值

//给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。
//
//请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1 。

public class Solution {
    public static int dominantIndex(int[] nums) {
        boolean flag = true;
        int max = nums[0];
        int index = 0;
        if (nums.length == 1) {
            return index;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                if (nums[i] >= 2 * max) {
                    flag = true;
                } else {
                    flag = false;
                }
                index = i;
                max = nums[i];
            } else {
                if (max >= 2 * nums[i]) {
                    // 只有在前面flag都为true情况下，才能为true
                    if (flag) {
                        flag = true;
                    }
                } else {
                    flag = false;
                }
            }

        }
        if (flag) {
            return index;
        }
        return -1;
    }
}
