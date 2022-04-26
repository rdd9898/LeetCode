package com.hy.day6;

//2029.石子游戏 九

//Alice 和 Bob 再次设计了一款新的石子游戏。现有一行 n 个石子，每个石子都有一个关联的数字表示它的价值。给你一个整数数组 stones ，其中 stones[i] 是第 i 个石子的价值。
//
//Alice 和 Bob 轮流进行自己的回合，Alice 先手。每一回合，玩家需要从 stones 中移除任一石子。
//
//如果玩家移除石子后，导致 所有已移除石子 的价值 总和 可以被 3 整除，那么该玩家就 输掉游戏 。
//如果不满足上一条，且移除后没有任何剩余的石子，那么 Bob 将会直接获胜（即便是在 Alice 的回合）。
//假设两位玩家均采用 最佳 决策。如果 Alice 获胜，返回 true ；如果 Bob 获胜，返回 false 。

import java.util.Arrays;

public class Solution {
    public static boolean stoneGameIX(int[] stones) {
        Arrays.sort(stones);
        int[] flags = new int[stones.length];
        int total = 0;
        for (int i = 0; i < stones.length; i++) {
            boolean flag = false;
            boolean flag2 = false;
            for (int j = 0; j < stones.length; j++) {
                if (flags[j] == 1) {
                    // 已经被选
                    continue;
                }
                if ((total + stones[j]) % 3 == 0) {
                    // 有石头可选 但选了就输
                    flag2 = true;
                    continue;
                }
                if ((total + stones[j]) % 3 != 0){
                    // 可以再选石子不输
                    flag = true;
                    flags[j] = 1;
                    total += stones[j];
                    break;
                }
            }
            if (flag2 && !flag) {
                if (i % 2 == 0) {
                    return false;
                } else {
                    return true;
                }
            }

        }
        return false;
    }
}
