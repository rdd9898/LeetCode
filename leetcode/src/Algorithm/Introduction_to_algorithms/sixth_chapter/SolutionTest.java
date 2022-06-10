package Algorithm.Introduction_to_algorithms.sixth_chapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxHeapIFY() {
        int[] arr = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        Heap heap = new Heap(arr, arr.length);
        Solution solution = new Solution();
        solution.buildMaxHeap(heap);
        solution.maxHeapIFYByWhile(heap, 2);
    }
}