package daily_practice.undefined_2022.hy.day02;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        int a = 2147483647;
        int[] b = {2, 0, 0};
//        long res = s.superPow(a, b);
        int res = NormalSoulution.superPow(a, b);
        System.out.println(res);
    }
}
