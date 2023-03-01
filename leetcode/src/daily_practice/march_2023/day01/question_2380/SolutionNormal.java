package daily_practice.march_2023.day01.question_2380;

/**
 * @program: LeetCode
 * @description: 将 1 看做车，向左走
 * @author: Mr.Hu
 * @create: 2023-03-01 22:26
 **/
public class SolutionNormal {

    public int secondsToRemoveOccurrences(String s) {
        int f = 0, pre0 = 0;
        for (var i = 0; i < s.length(); i++)
            if (s.charAt(i) == '0') ++pre0;
            else if (pre0 > 0) f = Math.max(f + 1, pre0); // 前面有 0 的时候才会移动
        return f;
    }

}
