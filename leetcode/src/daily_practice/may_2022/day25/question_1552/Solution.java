package daily_practice.may_2022.day25.question_1552;

import java.util.Arrays;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1552.两球之间的磁力
 * @date 2022年05月25日 10:44
 */
public class Solution {

    public int maxDistance(int[] position, int m) {
        int left = 1;
        Arrays.sort(position);
        int right = position[position.length - 1];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cur = 1;
            int j = 0;
            for (int i = 1; i < position.length; i++) {
                if (position[i] - position[j] >= mid) {
                    cur++;
                    j = i;
                }
            }
            if (cur < m) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

}
