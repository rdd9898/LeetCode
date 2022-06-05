package daily_practice.june_2022.day05.question_478;

import java.util.Random;

/**
 * @program: LeetCode
 * @description: 478.在圆内随机生成点
 * @author: Mr.Hu
 * @create: 2022-06-05 11:50
 **/
public class Solution {

    private double r;
    private double x_center;
    private double y_center;
    private Random random;

    public Solution(double radius, double x_center, double y_center) {
        this.r = radius;
        this.x_center = x_center;
        this.y_center = y_center;
        this.random = new Random();
    }

    public double[] randPoint() {
        while (true) {
            double x = random.nextDouble() * (2 * r) - r;
            double y = random.nextDouble() * (2 * r) - r;
            if (x * x + y * y <= r * r) {
                return new double[]{x + x_center, y + y_center};
            }
        }
    }

}
