package Algorithm.Sort;

/**
 * @author 胡阳
 * @ClassName InsertSort
 * @description: 插入排序
 * @date 2022年05月31日 11:27
 */
public class InsertSort {

    public void insertSortByUp(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int keyIndex = i;
            int j = i - 1;
            while (j >= 0 && nums[j] > nums[keyIndex]) {
                int temp = nums[keyIndex];
                nums[keyIndex] = nums[j];
                nums[j] = temp;
                keyIndex--;
                j--;
            }
        }
    }


    public void insertSortByDown(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int keyIndex = i;
            int j = i - 1;
            while (j >= 0 && nums[j] < nums[keyIndex]) {
                int temp = nums[keyIndex];
                nums[keyIndex] = nums[j];
                nums[j] = temp;
                keyIndex--;
                j--;
            }
        }
    }

}
