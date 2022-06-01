package Algorithm.Sort;

/**
 * @author 胡阳
 * @ClassName MergeSort
 * @description: 归并排序
 * @date 2022年06月01日 10:34
 */
public class MergeSort {

    /**
     * @Description: 归并排序，注意 p，r 分别为最左元素索引和最右元素索引
     * @Param: [array, p, r]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/1 11:12
     */
    public void mergeSort(int[] array, int p, int r) {
        // 如果 p >= r，说明该子序列只有一个元素，不需要排序，默认就是排好的
        if (p < r) {
            int q = p + (r - p) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }

    /**
     * @Description: 合并两个已排序的子序列以产生以排序的答案
     * @Param: [array, p, q, r]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/1 10:54
     */
    public void merge(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] arrayLeft = new int[n1 + 1];
        int[] arrayRight = new int[n2 + 1];
        for (int i = 0; i < n1; i++) {
            arrayLeft[i] = array[p + i];
        }
        for (int j = 0; j < n2; j++) {
            arrayRight[j] = array[q + j + 1];
        }
        arrayLeft[n1] = Integer.MAX_VALUE;
        arrayRight[n2] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for (int x = p; x <= r; x++) {
            if (arrayLeft[i] <= arrayRight[j]) {
                array[x] = arrayLeft[i];
                i++;
            } else {
                array[x] = arrayRight[j];
                j++;
            }
        }
    }

}
