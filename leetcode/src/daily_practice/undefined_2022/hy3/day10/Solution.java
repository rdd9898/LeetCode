package daily_practice.undefined_2022.hy3.day10;

//1765.地图中的最高点

//给你一个大小为 m x n 的整数矩阵 isWater ，它代表了一个由 陆地 和 水域 单元格组成的地图。
//
//如果 isWater[i][j] == 0 ，格子 (i, j) 是一个 陆地 格子。
//如果 isWater[i][j] == 1 ，格子 (i, j) 是一个 水域 格子。
//你需要按照如下规则给每个单元格安排高度：
//
//每个格子的高度都必须是非负的。
//如果一个格子是是 水域 ，那么它的高度必须为 0 。
//任意相邻的格子高度差 至多 为 1 。当两个格子在正东、南、西、北方向上相互紧挨着，就称它们为相邻的格子。（也就是说它们有一条公共边）
//找到一种安排高度的方案，使得矩阵中的最高高度值 最大 。
//
//请你返回一个大小为 m x n 的整数矩阵 height ，其中 height[i][j] 是格子 (i, j) 的高度。如果有多种解法，请返回 任意一个 。

/**
 * @author ：HuYang
 * @date ：Created in 2022/1/29 10:09
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static int[][] highestPeak(int[][] isWater) {
        int[][] ans = new int[isWater.length][isWater[0].length];
        int[][] flag = new int[isWater.length][isWater[0].length];
        for (int i = 0; i < isWater.length; i++) {
            for (int j = 0; j < isWater[0].length; j++) {
                if (isWater[i][j] == 1) {
                    ans[i][j] = 0;
                    flag[i][j] = 1;
                    if (i > 0 && flag[i-1][j] != 1) {
                        ans[i-1][j] ++;
                        flag[i-1][j] = 1;
                    }
                    if (i < (isWater.length - 1) && flag[i+1][j] !=1 ) {
                        ans[i+1][j] ++;
                        flag[i+1][j] = 1;
                    }
                    if (j > 0 && flag[i][j-1] != 1) {
                        ans[i][j-1] ++;
                        flag[i][j-1] = 1;
                    }
                    if (j < (isWater[0].length - 1) && flag[i][j+1] !=1 ) {
                        ans[i][j+1] ++;
                        flag[i][j+1] = 1;
                    }
                }
            }
        }
        return ans;
    }
}
