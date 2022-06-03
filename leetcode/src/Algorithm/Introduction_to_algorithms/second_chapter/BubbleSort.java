package Algorithm.Introduction_to_algorithms.second_chapter;

/**
 * @author 胡阳
 * @ClassName BubbleSort
 * @description: 冒泡排序
 * @date 2022年06月02日 10:22
 */
public class BubbleSort {

    public void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

}
