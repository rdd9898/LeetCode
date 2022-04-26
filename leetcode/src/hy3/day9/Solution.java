package com.hy.day9;

//1996.游戏中弱角色的数量

//你正在参加一个多角色游戏，每个角色都有两个主要属性：攻击 和 防御 。给你一个二维整数数组 properties ，其中 properties[i] = [attacki, defensei] 表示游戏中第 i 个角色的属性。
//
//如果存在一个其他角色的攻击和防御等级 都严格高于 该角色的攻击和防御等级，则认为该角色为 弱角色 。更正式地，如果认为角色 i 弱于 存在的另一个角色 j ，那么 attackj > attacki 且 defensej > defensei 。
//
//返回 弱角色 的数量。

import java.util.Arrays;

/**
 * @author ：HuYang
 * @date ：Created in 2022/1/28 18:43
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static int numberOfWeakCharacters(int[][] properties) {
        int ans = 0;
        // 按攻击值从大到小排列
        Arrays.sort(properties, (o1, o2) -> {
            return o1[0] == o2[0] ? (o1[1] - o2[1]) : (o2[0] - o1[0]);
        });
        int maxDef = 0;
        // maxDef为遍历过的人物的最大防御值，因为攻击按从大到小排列，所以遍历到的人物防御值小于最大防御值，该为弱者
        for (int[] p: properties) {
            if (p[1] < maxDef) {
                ans++;
            } else {
                maxDef = p[1];
            }
        }
        return ans;
    }
}
