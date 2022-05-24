package daily_practice.may_2022.day24.question_658;

import java.util.*;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 658.找到 K 个最接近的元素
 * @date 2022年05月24日 9:50
 */
public class Solution {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;
        List<Integer> ans = new ArrayList<>();
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        for (int i = 0; i < k; i++) {
            if (right >= 0 && left < arr.length) {
                if (x - arr[right] <= arr[left] - x) {
                    ans.add(arr[right]);
                    right--;
                } else {
                    ans.add(arr[left]);
                    left++;
                }
            } else if (right >= 0) {
                ans.add(arr[right]);
                right--;
            } else if (left < arr.length) {
                ans.add(arr[left]);
                left++;
            }
        }
        ans.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return ans;
    }

}
