package daily_practice.undefined_2022.hy.day30;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        int n = 3;
        List<Integer> list = Solution.grayCode(n);
        list.forEach(System.out::println);
    }
}
