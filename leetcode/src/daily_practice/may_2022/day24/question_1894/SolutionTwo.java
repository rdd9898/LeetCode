package daily_practice.may_2022.day24.question_1894;

/**
 * 二分查找 + 前缀和
 * @author 胡阳
 * @ClassName SolutionTwo
 * @description: 1894.找出需要补充粉笔的学生编号
 * @date 2022年05月24日 10:55
 */
public class SolutionTwo {

    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        if (chalk[0] > k) {
            return 0;
        }
        for (int i = 1; i < n; ++i) {
            chalk[i] += chalk[i - 1];
            if (chalk[i] > k) {
                return i;
            }
        }

        k %= chalk[n - 1];
        return binarySearch(chalk, k);
    }

    public int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

}
