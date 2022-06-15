package Algorithm.Introduction_to_algorithms.eighth_chapter;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: eighth_chapter
 * @date 2022年06月15日 10:48
 */
public class Solution {

    /**
     * @Description: 技术排序，k 为输入数组最大值，输入数组的元素都在 [0. k] 范围内
     * @Param: [inputArray, outputArray, k]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/15 11:03
     */
    public void countingSort(int[] inputArray, int[] outputArray, int k) {
        int[] temp = new int[k + 1];
        for (int i = 0; i < inputArray.length; i++) {
            temp[inputArray[i]]++;
        }
        for (int i = 1; i <= k; i++) {
            temp[i] += temp[i - 1];
        }
        for (int i = inputArray.length - 1; i >= 0; i--) {
            outputArray[temp[inputArray[i]] - 1] = inputArray[i];
            temp[inputArray[i]]--;
        }
    }

}
