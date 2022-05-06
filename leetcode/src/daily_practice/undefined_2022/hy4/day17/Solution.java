package daily_practice.undefined_2022.hy4.day17;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 1552.两球之间的磁力
 * @author: Mr.Hu
 * @create: 2022-05-03 23:04
 **/
public class Solution {

    public int maxDistance(int[] position, int m) {
        int ans = -1;
        Arrays.sort(position);
        int left = 1;
        int right = position[position.length - 1] - left;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (check(position, mid, m)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private boolean check(int[] position, int mid, int m) {
        int pre = position[0];
        int cnt = 1;
        for (int i = 1; i < position.length; i++) {
            if (position[i] - pre >= mid) {
                cnt++;
                pre = position[i];
            }
        }
        return cnt >= m;
    }

}
