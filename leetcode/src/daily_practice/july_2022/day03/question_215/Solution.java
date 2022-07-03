package daily_practice.july_2022.day03.question_215;

/**
 * 快速排序
 * @program: LeetCode
 * @description: 215.数组中的第 K 个最大元素
 * @author: Mr.Hu
 * @create: 2022-07-03 11:31
 **/
public class Solution {

    public int findKthLargest(int[] nums, int k) {
        int p = 0;
        int r = nums.length - 1;
        quickSort(nums, p, r);
        return(nums[k - 1]);
    }

    public void quickSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = partition(arr, p, r);
            quickSort(arr, p, q - 1);
            quickSort(arr, q + 1, r);
        }
    }

    public int partition(int[] nums, int p, int r) {
        int x = nums[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (nums[j] >= x) {
                i++;
                exchange(nums, i, j);
            }
        }
        exchange(nums, i + 1, r);
        return i + 1;
    }
    public void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
