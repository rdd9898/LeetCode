package Algorithm.Introduction_to_algorithms.fourth_chapter;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 第四章算法
 * @date 2022年06月03日 10:41
 */
public class Solution {

    /**
     * @Description: 找出两个子数组合并后必经过中点的最大子数组，返回的数组为 [startIndex, endIndex, MaximumSum]
     * @Param: [array, low, mid, high]
     * @return: int[]
     * @Author: HuYang
     * @Date:2022/6/3 11:19
     */
    public int[] findMaxCrossingSubarray(int[] array, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxLeft = -1;
        //  找到带中点的左边连续子数组的最大和，因为带中点，所以从中点开始往左找
        for (int i = mid; i >= low; i--) {
            sum += array[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        int maxRight = -1;
        //  找到带中点的右边连续子数组的最大和，因为带中点，所以从中点开始往右找
        for (int i = mid + 1; i <= high; i++) {
            sum += array[i];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = i;
            }
        }
        // 返回带中点的左索引、右索引和最大子数组和
        return new int[]{maxLeft, maxRight, leftSum + rightSum};
    }

    /**
     * @Description: 寻找最大连续子数组，这里返回的数组为 [startIndex, endIndex, MaximumSum]
     * @Param: [array, low, high]
     * @return: int[]
     * @Author: HuYang
     * @Date:2022/6/3 11:17
     */
    public int[] findMaximumSubarray(int[] array, int low, int high) {
        // 当子数组只有一个数时，不需要计算，该数为该子数组最大和
        if (high == low) {
            return new int[]{low, high, array[low]};
        } else {
            int mid = low + (high - low) / 2;
            // 找左边数组最大连续子数组和
            int[] ints1 = findMaximumSubarray(array, low, mid);
            // 找右边数组最大连续子数组和
            int[] ints2 = findMaximumSubarray(array, mid + 1, high);
            // 找跨过中点的数组最大连续子数组和
            int[] ints3 = findMaxCrossingSubarray(array, low, mid, high);
            // 返回三个最大连续子数组和的最大值
            if (ints1[2] >= ints2[2] && ints1[2] >= ints3[2]) {
                return ints1;
            } else if (ints2[2] >= ints1[2] && ints2[2] >= ints3[2]) {
                return ints2;
            } else {
                return ints3;
            }
        }
    }

    /**
     * @Description: 使用线性时间完成最大子数组问题，这里返回的数组为 [startIndex, endIndex, MaximumSum]
     * @Param: [array]
     * @return: int[]
     * @Author: HuYang
     * @Date:2022/6/3 12:42
     */
    public int[] iterativeFindMaximumSubarray(int[] array) {
        int sum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int n = array.length;
        int low = 0;
        int high = 0;
        int currentHigh;
        int currentLow = -1;
        for (int j = 0; j < n; j++) {
            currentHigh = j;
            if (sum > 0) {
                sum += array[j];
            } else {
                currentLow = j;
                sum = array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                low = currentLow;
                high = currentHigh;
            }
        }
        return new int[]{low, high, maxSum};
    }

}
