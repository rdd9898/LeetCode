package daily_practice.may_2022.day18.question_668;

/**
 * 要学会逆向思考，对于乘法表中的数字 xx，它是乘法表中第几小的数字？
 * 善用二分查找
 * @author 胡阳
 * @ClassName Solution
 * @description: 668.乘法表中第 k 小的数
 * @date 2022年05月18日 9:21
 */
public class Solution {

    public int findKthNumber(int m, int n, int k) {
        int left = 1;
        int right = m * n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = mid / n * n;
            for (int i = mid / n + 1; i <= m; i++) {
                count += mid / i;
            }
            if (count >= k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

}
