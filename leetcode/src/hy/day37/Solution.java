package hy.day37;

//373.查找和最小的K对数字

//给定两个以升序排列的整数数组 nums1 和 nums2 ,以及一个整数 k 。
//
//定义一对值(u,v)，其中第一个元素来自nums1，第二个元素来自 nums2 。
//
//请找到和最小的 k 个数对 (u1,v1), (u2,v2) ... (uk,vk)。

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年01月14日 10:50
 */
public class Solution {
    /**
     * @Description:
     * @Param: [nums1, nums2, k]
     * @return: java.util.List<java.util.List < java.lang.Integer>>
     * @Author: HuYang
     * @Date:2022/1/14 10:52
     */
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        boolean[] flag1 = new boolean[nums1.length];
        boolean[] flag2 = new boolean[nums2.length];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums1.length && i < k; i++) {
            for (int j = 0; j < nums2.length && j < k; j++) {
                List<Integer> list = new ArrayList<>();
                list.add(nums1[i]);
                list.add(nums2[j]);
                lists.add(list);
            }
        }
        lists.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return (o1.get(0) + o1.get(1)) - (o2.get(0) + o2.get(1));
            }
        });
        if (k > nums1.length * nums2.length) {
            return lists;
        }
        return lists.subList(0, k);
    }
}
