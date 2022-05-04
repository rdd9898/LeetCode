package Algorithm.Tire.BinarySearch;

/**
 * @author 胡阳
 * @ClassName BinarySearch
 * @description: 二分查找
 * @date 2022年05月04日 10:10
 */
public class BinarySearch {

    /**
     * @Description: 基础版：找出一个相等元素的位置
     * @Param: [nums, target] 
     * @return: int
     * @Author: HuYang
     * @Date:2022/5/4 10:11
     */
    public static int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = (left + right) / 2;
            // 因为 mid 索引处肯定不是target，所以left = mid - 1
            if (nums[mid] < target) {
                left = mid + 1;
            // 因为 right 为开区间，所以right = mid
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                return mid;
            }
        }

        return -1;
    }

    /**
     * @Description: 进阶版：找出最小的相等元素的下标
     * @Param: [nums, target] 
     * @return: int
     * @Author: HuYang
     * @Date:2022/5/4 10:35
     */
    public static int binarySearchLeft(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = (left + right) / 2;
            // 因为 mid 索引处肯定不是与target相等的元素，所以left = mid - 1
            if (nums[mid] < target) {
                left = mid + 1;
            // 因为 right 为开区间，所以right = mid
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                right = mid;
            }
        }
        return left;
    }

    /**
     * @Description: 进阶版：找出最大的相等元素的下标
     * @Param: [nums, target]
     * @return: int
     * @Author: HuYang
     * @Date:2022/5/4 10:35
     */
    public static int binarySearchRight(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = (left + right) / 2;
            // 因为 mid 索引处肯定不是与target相等的元素，所以left = mid - 1
            if (nums[mid] < target) {
                left = mid + 1;
            // 因为 right 为开区间，所以right = mid
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right - 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int target = 8;
        int ans = binarySearch(nums, target);
        System.out.println(ans);
    }

}
