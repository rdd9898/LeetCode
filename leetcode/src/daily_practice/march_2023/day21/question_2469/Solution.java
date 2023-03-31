package daily_practice.march_2023.day21.question_2469;

/**
 * @program: LeetCode
 * @description: 2469.温度转换
 * @author: Mr.Hu
 * @create: 2023-03-21 21:51
 **/
public class Solution {

    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32};
    }

}
