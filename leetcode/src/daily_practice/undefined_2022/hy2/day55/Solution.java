package daily_practice.undefined_2022.hy2.day55;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 693.交替位二进制数
 * @date 2022年03月28日 9:21
 */
public class Solution {

    public boolean hasAlternatingBits(int n) {
        int tmp = 2;
        while (n != 0) {
            if (n % 2 != tmp) {
                tmp = n % 2;
                n = n / 2;
            } else {
                return false;
            }
        }
        return true;
    }

}
