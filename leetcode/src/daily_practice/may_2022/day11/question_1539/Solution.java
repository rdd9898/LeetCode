package daily_practice.may_2022.day11.question_1539;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1539.第 k 个缺失的正整数
 * @date 2022年05月11日 11:17
 */
public class Solution {

    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] - mid - 1 >= k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if(right < 0) {
            return k;
        }
        return k + right + 1;
    }

}
