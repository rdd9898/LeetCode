package daily_practice.undefined_2022.hy.day25;

//846.一手顺子

//Alice 手中有一把牌，她想要重新排列这些牌，分成若干组，使每一组的牌数都是 groupSize ，并且由 groupSize 张连续的牌组成。
//
//给你一个整数数组 hand 其中 hand[i] 是写在第 i 张牌，和一个整数 groupSize 。如果她可能重新排列这些牌，返回 true ；否则，返回 false 。

/*
* 先将hand有小到大排序，从小到大依次拿牌如果不能成顺子返回false，注意重复牌问题，可以设置布尔数组进行标记
* */

import java.util.Arrays;

public class Solution {
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        boolean[] flag = new boolean[hand.length];
        int[] group = new int[groupSize];
        if (hand.length % groupSize != 0 ) {
            return false;
        }
        Arrays.sort(hand);
        int n;
        for (int i = 0; i < hand.length/groupSize; i++) {
            n = 0;
            for (int j=0; j<groupSize; j++) {
                while (j == 0 && flag[n]) {
                    n++;
                }
                while ((j !=0 && hand[n] != group[j-1] + 1) || flag[n]) {
                    n++;
                    if (n == hand.length)
                        return false;
                }
                group[j] = hand[n];
                flag[n] = true;
            }
        }
        return true;
    }
}
