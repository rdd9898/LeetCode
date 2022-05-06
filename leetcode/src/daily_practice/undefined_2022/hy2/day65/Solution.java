package daily_practice.undefined_2022.hy2.day65;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年04月11日 9:20
 */
public class Solution {

    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = 10;
        for (int i = 2; i <= n; i++) {
            int tmp = 1;
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    tmp *= 9;
                } else {
                    tmp *= 10 - j;
                }
            }
            ans += tmp;
        }
        return ans;
    }

}
