package daily_practice.may_2022.day06.qusetion_1009;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1009.十进制整数的反码
 * @date 2022年05月06日 9:15
 */
public class Solution {

    public int bitwiseComplement(int n) {

        StringBuilder stringBuilder = new StringBuilder();
        if (n == 0) {
            return 1;
        }
        while (n != 0) {
            int a = n % 2;
            if (a == 1) {
                stringBuilder.append(0);
            } else {
                stringBuilder.append(1);
            }
            n /= 2;
        }

        return Integer.parseInt(stringBuilder.reverse().toString(), 2);

    }

}
