package daily_practice.june_2022.day08.question_1037;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1037.有效的回旋镖
 * @date 2022年06月08日 10:27
 */
public class Solution {

    public boolean isBoomerang(int[][] points) {
        if (points[0][0] == points[1][0] && points[0][1] == points[1][1]) return false;
        if (points[2][0] == points[1][0] && points[2][1] == points[1][1]) return false;
        if (points[2][0] == points[0][0] && points[2][1] == points[0][1]) return false;
        if (points[0][0] == points[1][0] && points[0][0] == points[2][0]) return false;
        double ans1 = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0] + 0.0);
        double ans2 = (points[2][1] - points[0][1]) / (points[2][0] - points[0][0] + 0.0);
        return !(ans1 == ans2);
    }

}
