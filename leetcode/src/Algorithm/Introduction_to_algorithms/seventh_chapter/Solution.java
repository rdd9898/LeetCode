package Algorithm.Introduction_to_algorithms.seventh_chapter;

import java.util.Random;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: seventh_chapter
 * @date 2022年06月13日 9:33
 */
public class Solution {

    /**
     * @Description: 数组的划分，快速排序关键部分
     * @Param: [arr, p, r]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/14 10:15
     */
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

    /**
     * @Description: 交换数组两元素
     * @Param: [arr, i, j]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/14 10:15
     */
    public void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * @Description: 实现快速排序
     * @Param: [arr, p, r]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/14 10:17
     */
    public void quickSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = partition(arr, p, r);
            quickSort(arr, p, q - 1);
            quickSort(arr, q + 1, r);
        }
    }

    /**
     * @Description: 随机化取主元元素，然后进行划分
     * @Param: [arr, p, r] 
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/14 11:07
     */
    public int randomizedPartition(int[] arr, int p, int r) {
        Random random = new Random();
        int i = random.nextInt(r - p + 1) + p;
        exchange(arr, i, r);
        return partition(arr, p, r);
    }

    /**
     * @Description: 随机化版本的快速排序
     * @Param: [arr, p, r]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/14 11:08
     */
    public void randomizedQuickSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = randomizedPartition(arr, p, r);
            randomizedQuickSort(arr, p, q - 1);
            randomizedPartition(arr, q + 1, r);
        }
    }

    /**
     * @Description: Hoare 划分
     * @Param: [arr, p, r]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/14 11:46
     */
    public int hoarePartition(int[] arr, int p, int r) {
        int x = arr[p];
        int i = p - 1;
        int j = r + 1;
        while (true) {
            do {
                j--;
            } while (arr[j] > x);
            do {
                i++;
            } while (arr[i] < x);
            if (i < j) exchange(arr, i, j);
            else return j;
        }
    }

    /**
     * @Description: 基于 Hoare 划分的快速排序
     * @Param: [arr, p, r]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/14 11:46
     */
    public void hoareQuickSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = hoarePartition(arr, p, r);
            hoareQuickSort(arr, p, q);
            hoareQuickSort(arr, q + 1, r);
        }
    }

}
