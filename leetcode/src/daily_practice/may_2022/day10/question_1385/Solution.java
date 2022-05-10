package daily_practice.may_2022.day10.question_1385;

import java.util.Arrays;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1385.两个数组间的距离值
 * @date 2022年05月10日 11:04
 */
public class Solution {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            int left = 0;
            int right = arr2.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr2[mid] < arr1[i]) {
                    left = mid + 1;
                } else if(arr2[mid] > arr1[i]) {
                    right = mid - 1;
                } else {
                    left = mid;
                    break;
                }
            }
            if (left == arr2.length) {
                if (arr1[i] - arr2[arr2.length - 1] > d)
                    ans++;
            } else if (left == 0) {
                if (arr2[0] - arr1[i] > d)
                    ans++;
            } else if (arr2[left] - arr1[i] > d && arr1[i] - arr2[left - 1] > d) {
                ans++;
            }
        }
        return ans;
    }

}
