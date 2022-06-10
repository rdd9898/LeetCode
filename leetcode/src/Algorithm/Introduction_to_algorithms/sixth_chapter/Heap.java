package Algorithm.Introduction_to_algorithms.sixth_chapter;

/**
 * @author 胡阳
 * @ClassName Heap
 * @description: 堆
 * @date 2022年06月09日 10:41
 */
public class Heap {

    int[] arr;

    public Heap(int[] arr, int heapSize) {
        this.arr = new int[arr.length + 1];
        this.arr[0] = heapSize;
        for (int i = 0; i < arr.length; i++) {
            this.arr[i + 1] = arr[i];
        }
    }

}
