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

    /**
     * @Description: 创建最大堆
     * @Param: [heap]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/10 10:26
     */
    public void buildMaxHeap(Heap heap) {
        heap.arr[0] = heap.arr.length - 1;
        for (int i = (heap.arr[0] / 2); i >= 1; i--) {
            maxHeapIFY(heap, i);
        }
    }

    /**
     * @Description: 堆排序，heap.arr 从索引 1 开始排序，索引 0 记录的是 heap-size
     * @Param: [heap]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/10 10:33
     */
    public void heapSort(Heap heap) {
        buildMaxHeap(heap);
        for (int i = heap.arr[0]; i >= 2; i--) {
            int temp = heap.arr[i];
            heap.arr[i] = heap.arr[1];
            heap.arr[1] = temp;
            heap.arr[0]--;
            maxHeapIFY(heap, 1);
        }
    }

    /**
     * @Description: 返回最大堆中具有最大关键字的元素。
     * @Param: [heap]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/10 11:04
     */
    public int heapMaximum(Heap heap) {
        return heap.arr[1];
    }

    /**
     * @Description: 去掉并返回最大堆中具有最大关键字的元素
     * @Param: [heap]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/10 11:10
     */
    public int heapExtractMax(Heap heap) {
        if (heap.arr[0] < 1) {
            System.out.println("heap underflow");
            return -1;
        }
        int max = heap.arr[1];
        heap.arr[1] = heap.arr[heap.arr[0]];
        heap.arr[0]--;
        maxHeapIFY(heap, 1);
        return max;
    }

    /**
     * @Description: 将最大堆索引为 i 的关键字值增加到 key，这里假设 key 的值不小于索引为 i 的原关键字值
     * @Param: [heap, i, key] 
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/10 11:31
     */
    public void heapIncreaseKey(Heap heap, int i, int key) {
        if (key < heap.arr[i]) {
            System.out.println("new key is smaller than current key");
            return;
        }
        heap.arr[i] = key;
        while (i > 1 && heap.arr[parent(i)] < heap.arr[i]) {
            int temp = heap.arr[parent(i)];
            heap.arr[parent(i)] = heap.arr[i];
            heap.arr[i] = temp;
            i = parent(i);
        }
    }

    /**
     * @Description: 把元素 key 插入最大堆 heap 中。
     * @Param: [heap, key] 
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/10 14:04
     */
    public void maxHeapInsert(Heap heap, int key) {
        heap.arr[0]++;
        heap.arr[heap.arr[0]] = Integer.MIN_VALUE;
        heapIncreaseKey(heap, heap.arr[0], key);
    }

}
