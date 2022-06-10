package Algorithm.Introduction_to_algorithms.sixth_chapter;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: sixth_chapter
 * @date 2022年06月09日 10:23
 */
public class Solution {

    /**
     * @Description: 返回父亲节点索引
     * @Param: [i]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/9 10:25
     */
    public int parent(int i) {
        return i / 2;
    }

    /**
     * @Description: 返回左孩子节点索引
     * @Param: [i]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/9 10:25
     */
    public int left(int i) {
        return i * 2;
    }

    /**
     * @Description: 返回右孩子节点索引
     * @Param: [i]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/9 10:25
     */
    public int right(int i) {
        return i * 2 + 1;
    }

    /**
     * @Description: 维护最大堆，如果索引 i 的值违背最大堆，进行下沉操作
     * @Param: [heap, i]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/9 10:57
     */
    public void maxHeapIFY(Heap heap, int i) {
        int l = left(i);
        int r = right(i);
        int largest = -1;
        if (l <= heap.arr[0] && heap.arr[l] > heap.arr[i]) {
            largest = l;
        } else largest = i;
        if (r <= heap.arr[0] && heap.arr[r] > heap.arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = heap.arr[largest];
            heap.arr[largest] = heap.arr[i];
            heap.arr[i] = temp;
            maxHeapIFY(heap, largest);
        }
    }

    /**
     * @Description: 维护最小堆，如果索引 i 的值违背最小堆，进行下沉操作
     * @Param: [heap, i]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/9 11:07
     */
    public void minHeapIFY(Heap heap, int i) {
        int l = left(i);
        int r = right(i);
        int smallest = -1;
        if (l <= heap.arr[0] && heap.arr[l] < heap.arr[i]) {
            smallest = l;
        } else smallest = i;
        if (r <= heap.arr[0] && heap.arr[r] < heap.arr[smallest]) {
            smallest = r;
        }
        if (smallest != i) {
            int temp = heap.arr[smallest];
            heap.arr[smallest] = heap.arr[i];
            heap.arr[i] = temp;
            minHeapIFY(heap, smallest);
        }
    }

    /**
     * @Description: 通过 while 循环维护最大堆，如果索引 i 的值违背最大堆，进行下沉操作
     * @Param: [heap, i]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/9 10:57
     */
    public void maxHeapIFYByWhile(Heap heap, int i) {
        while (true) {
            int l = left(i);
            int r = right(i);
            int largest = -1;
            if (l <= heap.arr[0] && heap.arr[l] > heap.arr[i]) {
                largest = l;
            } else largest = i;
            if (r <= heap.arr[0] && heap.arr[r] > heap.arr[largest]) {
                largest = r;
            }
            // 如果符合最大堆，返回
            if (largest == i) return;
            // 交换最大值
            int temp = heap.arr[largest];
            heap.arr[largest] = heap.arr[i];
            heap.arr[i] = temp;
            i = largest;
        }
    }

    public void buildMaxHeap(Heap heap) {
        heap.arr[0] = heap.arr.length - 1;
        for (int i = (heap.arr[0] / 2); i >= 1; i--) {
            maxHeapIFY(heap, i);
        }
    }

}
