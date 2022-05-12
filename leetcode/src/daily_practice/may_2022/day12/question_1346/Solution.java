package daily_practice.may_2022.day12.question_1346;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 1346.检查整数及其两倍数是否存在
 * @author: Mr.Hu
 * @create: 2022-05-12 21:19
 **/
public class Solution {

    public boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= 0) {
                int left = i + 1;
                int right = arr.length - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (arr[mid] > 2 * arr[i]) {
                        right = mid - 1;
                    } else if (arr[mid] < 2 * arr[i]) {
                        left = mid + 1;
                    } else {
                        return true;
                    }
                }
            } else {
                int left = 0;
                int right = i - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (arr[mid] < 2 * arr[i]) {
                        left = mid + 1;
                    } else if (arr[mid] > 2 * arr[i]) {
                        right = mid - 1;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
