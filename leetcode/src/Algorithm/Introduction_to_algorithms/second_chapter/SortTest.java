package Algorithm.Introduction_to_algorithms.second_chapter;

import org.junit.Test;

public class SortTest {

    @Test
    public void insertSortByUp() {
        int[] nums = {1, 5, 3, 7, 0, 4};
        InsertSort insertSort = new InsertSort();
        insertSort.insertSortByUp(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    @Test
    public void insertSortByDown() {
        int[] nums = {1, 5, 3, 7, 0, 4};
        InsertSort insertSort = new InsertSort();
        insertSort.insertSortByDown(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    @Test
    public void merge() {
        int[] array = {1,3,1,4,2,4,5,7,1,2,3,6,1,6,8,6};
        int p = 4;
        int q = 7;
        int r = 11;
        MergeSort mergeSort = new MergeSort();
//        mergeSort.merge(array, p, q, r);
        mergeSort.mergeSort(array, 0, array.length - 1);
        System.out.println(1);
    }

    @Test
    public void bubbleSortTest() {

        int[] array = {1,3,1,4,2,4,5,7,1,2,3,6,1,6,8,6};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
        for (int i : array) {
            System.out.println(i);
        }

    }

    @Test
    public void countInversionsTest() {
        int[] array = {2, 3, 8, 6, 1};
        MergeSort mergeSort = new MergeSort();
        int ans = mergeSort.countInversions(array, 0, array.length - 1);
        System.out.println(ans);
    }



}