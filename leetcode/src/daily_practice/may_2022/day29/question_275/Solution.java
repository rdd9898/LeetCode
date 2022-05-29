package daily_practice.may_2022.day29.question_275;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 275.H 指数Ⅱ
 * @date 2022年05月29日 11:10
 */
public class Solution {

    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] >= n - mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return n - left;
    }

}
