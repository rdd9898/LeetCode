package daily_practice.april_2023.day17.offer_40;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 40. 最小的k个数
 * @author: Mr.Hu
 * @create: 2023-04-17 22:07
 **/
public class Solution {

//    public int[] getLeastNumbers(int[] arr, int k) {
//        Arrays.sort(arr);
//        return Arrays.copyOf(arr, k);
//    }

    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1, k);
        return Arrays.copyOf(arr, k);
    }

    private void quickSort(int[] arr, int l, int r, int k) {
        if (l >= r) return;
        int i = l, j = r;
        while (i < j) {
            while (i < j && arr[j] >= arr[l]) j--;
            while (i < j && arr[i] <= arr[l]) i++;
            swap(arr, i, j);
        }
        swap(arr, i, l);
        if (i > k) quickSort(arr, l, i - 1, k);
        else if (i < k) quickSort(arr, i + 1, r, k);
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
