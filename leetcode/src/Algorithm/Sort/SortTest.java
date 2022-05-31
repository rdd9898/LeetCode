package Algorithm.Sort;

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
}