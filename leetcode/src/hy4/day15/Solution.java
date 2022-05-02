package hy4.day15;

/**
 * @program: LeetCode
 * @description: 1779.找到最近的由相同 X 或 Y 坐标的点
 * @author: Mr.Hu
 * @create: 2022-05-02 20:30
 **/
public class Solution {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int tmp = MHDDistance(x, y, points[i][0], points[i][1]);
                if (tmp < min) {
                    ans = i;
                    min = tmp;
                }
            }
        }
        return ans;
    }

    public int MHDDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

}
