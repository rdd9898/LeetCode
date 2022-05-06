package Algorithm.PriorityQueue;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * @author 胡阳
 * @ClassName MaxHeap
 * @description: 大顶堆
 * @date 2022年05月02日 11:26
 */
public class MaxHeap {

    // 容量
    private int capacity;
    // 当前节点数量
    private int size = 0;
    // 存储节点
    private int[] array;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    // 获得左孩子节点索引
    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    // 获得右孩子节点索引
    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    // 获得父节点索引
    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    // 是否有左孩子节点
    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    // 是否有右孩子节点
    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    // 是否有父节点
    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    // 获得左孩子节点值
    private int leftChild(int parentIndex) {
        return array[getLeftChildIndex(parentIndex)];
    }

    // 获得右孩子节点值
    private int rightChild(int parentIndex) {
        return array[getRightChildIndex(parentIndex)];
    }

    // 获得父节点值
    private int parent(int childIndex) {
        return array[getParentIndex(childIndex)];
    }

    // 添加节点
    // 时间复杂度：O(log N)
    public void insert(int item) {
        // 容量扩容
        if (size == capacity) {
            array = Arrays.copyOf(array, capacity * 2);
            capacity = capacity * 2;
        }
        // 将 item 写入 size 索引处，即写入最后
        array[size] = item;
        size++;
        // 将 array 修正为大顶堆
        heapifyUp();
    }

    // 从末尾修正为大顶堆
    private void heapifyUp() {
        // 获得 item 节点所在的索引
        int index = size - 1;
        // 不是根节点且父节点的值小于 item 节点的值
        while (hasParent(index) && parent(index) < array[index]) {
            // 因为是大顶堆，所以交换父子节点
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    // 交换
    private void swap(int parentIndex, int index) {
        int temp = array[parentIndex];
        array[parentIndex] = array[index];
        array[index] = temp;
    }

    // 抛出第一个节点，且保证还是大顶堆
    // 时间复杂度：O(log N)
    public int poll() {
        // 如果此时堆为空，抛出异常
        if (size == 0) {
            throw new NoSuchElementException();
        }
        // 将堆顶元素抛出
        int element = array[0];
        // 将最后一个节点插入到堆顶
        array[0] = array[size - 1];
        size--;
        // 重新修正为大顶堆
        heapifyDown();
        return element;
    }

    // 从开头修正为大顶堆
    private void heapifyDown() {
        int index = 0;
        // 完全二叉树 现有左孩子再有右孩子
        while (hasLeftChild(index)) {
            // 寻找较大的孩子节点
            int largerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) > leftChild(index)) {
                largerChildIndex = getRightChildIndex(index);
            }
            // 如果当前节点的值小于较大孩子节点的值，交换父子节点
            if (array[index] < array[largerChildIndex]) {
                swap(index, largerChildIndex);
            } else {
                break;
            }
            index = largerChildIndex;
        }
    }

    // 返回最大元素但不抛出
    public int peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return array[0];
    }

}
