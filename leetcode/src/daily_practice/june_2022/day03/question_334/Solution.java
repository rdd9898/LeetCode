package daily_practice.june_2022.day03.question_334;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 334.递增的三元子序列
 * @date 2022年06月03日 9:51
 */
public class Solution {

    public boolean increasingTriplet(int[] nums) {
        int[] tmp = new int[3];
        tmp[0] = nums[0];
        int size = 1;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] > tmp[size - 1]) {
                tmp[size] = nums[i];
                size++;
                if (size == 3) {
                    return true;
                }
            } else if (nums[i] < tmp[size - 1]){
                int left = 0;
                int right = size - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (tmp[mid] > nums[i]) {
                        right = mid - 1;
                    } else if (tmp[mid] < nums[i]) {
                        left = mid + 1;
                    } else {
                        break;
                    }
                }
                if (left == 0) {
                    tmp[0] = nums[i];
                } else if (left == size) {
                    tmp[size - 1] = nums[i];
                } else {
                    tmp[left] = nums[i];
                }
            }
        }
        return false;
    }

}
