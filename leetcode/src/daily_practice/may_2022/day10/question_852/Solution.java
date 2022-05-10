package daily_practice.may_2022.day10.question_852;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 852.山脉数组的峰顶索引
 * @date 2022年05月10日 10:09
 */
public class Solution {

    public int peakIndexInMountainArray(int[] arr) {
        int ans = -1;
        int left = 1;
        int right = arr.length - 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                left = mid + 1;
            } else {
                ans = mid;
                break;
            }
        }
        return ans;
    }

}
