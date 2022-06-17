package Algorithm.Introduction_to_algorithms.ninth_chapter;

import java.util.Random;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: ninth_chapter
 * @date 2022年06月16日 11:11
 */
public class Solution {

    /**
     * @Description: 找到数组中最小的值
     * @Param: [arr]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/16 11:14
     */
    public int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public int randomizedPartition(int[] arr, int p, int r) {
        Random random = new Random();
        int i = random.nextInt(r - p + 1) + p;
        exchange(arr, i, r);
        return partition(arr, p, r);
    }

    public int partition(int[] arr, int p, int r) {
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (arr[j] <= x) {
                i++;
                exchange(arr, i, j);
            }
        }
        exchange(arr, i + 1, r);
        return i + 1;
    }

    public void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * @Description: 随机选择算法，找到 arr 数组中第 i 小的值
     * @Param: [arr, p, r, i]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/17 10:44
     */
    public int randomizedSelect(int[] arr, int p, int r, int i) {
        if (p == r) {
            return arr[p];
        }
        int q = randomizedPartition(arr, p, r);
        int k = q - p + 1;
        if (k == i) {
            return arr[q];
        } else if (i < k) {
            return randomizedSelect(arr, p, q - 1, i);
        } else {
            return randomizedSelect(arr, q + 1, r, i - k);
        }
    }

    /**
     * @Description: 随机选择使用循环版
     * @Param: [arr, p, r, i]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/17 10:48
     */
    public int randomizedSelectByWhile(int[] arr, int p, int r, int i) {
        while (true) {
            if (p == r) {
                return arr[p];
            }
            int q = randomizedPartition(arr, p, r);
            int k = q - p + 1;
            if (k == i) {
                return arr[q];
            } else if (i < k) {
                r = q - 1;
            } else {
                p = q + 1;
                i = i - k;
            }
        }
    }



}
