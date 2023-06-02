package daily_practice.april_2023.day27.offer_51;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 51. 数组中的逆序对
 * @author: Mr.Hu
 * @create: 2023-04-27 15:54
 **/
public class Solution {

    int ans;

    public int reversePairs(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return ans;
    }

    private void mergeSort(int[] nums, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);
            merge(nums, l, mid, r);
        }
    }

    private void merge(int[] nums, int l, int mid, int r) {
        int[] tmp = new int[r - l + 1];
        int index = 0;
        int p = l, q = mid + 1;
        while (p <= mid && q <= r) {
            if (nums[p] > nums[q]) {
                ans += mid - p + 1;
                tmp[index] = nums[q];
                q++;
            } else {
                tmp[index] = nums[p];
                p++;
            }
            index++;
        }
        while (p <= mid) {
            tmp[index] = nums[p];
            p++;
            index++;
        }
        while (q <= r) {
            tmp[index] = nums[q];
            q++;
            index++;
        }
        for (int i = 0; i < r - l + 1; i++) {
            nums[i + l] = tmp[i];
        }
    }

}
