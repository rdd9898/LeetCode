package daily_practice.undefined_2022.hy2.day53;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 172.阶乘后的0
 * @date 2022年03月25日 16:04
 */
public class Solution {

    public int trailingZeroes(int n) {
        int ans5 = 0;
        int ans2 = 0;
        for (int i = 2; i <= n; i += 2) {
            for (int j = i; j % 2 == 0; j /= 2) {
                ans2++;
            }
        }
        for (int i = 5; i <= n; i += 5) {
            for (int j = i; j % 5 == 0; j /= 5) {
                ans5++;
            }
        }
        return ans2 > ans5 ? ans5 : ans2;
    }

}
