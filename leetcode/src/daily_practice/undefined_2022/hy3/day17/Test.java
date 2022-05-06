package daily_practice.undefined_2022.hy3.day17;

import java.util.List;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/10 12:08
 * @description：
 * @modified By：
 * @version: $
 */
public class Test {
    public static void main(String[] args) {
        int n = 4;
        List<String> list = Solution.simplifiedFractions(n);
        list.forEach(System.out::println);
    }
}
