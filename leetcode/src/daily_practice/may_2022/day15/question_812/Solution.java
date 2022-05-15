package daily_practice.may_2022.day15.question_812;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 812.最大三角形面积
 * @date 2022年05月15日 9:33
 */
public class Solution {

    public double largestTriangleArea(int[][] points) {
        double ans = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    ans = Math.max(ans, calculate(i, j, k, points));
                }
            }
        }
        return ans;
    }

    private double calculate(int i, int j, int k, int[][] points) {
        return 0.5 * Math.abs(points[i][0] * points[j][1] + points[j][0] * points[k][1] + points[k][0] * points[i][1] - points[i][0] * points[k][1] - points[j][0] * points[i][1] - points[k][0] * points[j][1]);
    }

}
