package daily_practice.july_2022.day03.question_556;

import java.util.ArrayList;
import java.util.List;

/**
 * 1111169741的下一个排列是，从右到左找到第一个不满足单调增的地方，即9和6。
 * 交换6和1479中第一个比6大的（这样下一个排列尽可能小），即变为1111179641。
 * 然后将9641这部分倒序得到1111171469即可。
 * @program: LeetCode
 * @description: 556.下一个更大元素Ⅲ
 * @author: Mr.Hu
 * @create: 2022-07-03 11:28
 **/
public class SolutionTwo {

    public int nextGreaterElement(int n) {
        List<Integer> nums = intToList(n);
        int index = -1, len = nums.size();
        for (int i = 1; i < len; i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return -1;
        }
        for (int i = 0; i < index; i++) {
            if (nums.get(i) > nums.get(index)) {
                swap(nums, index, i);
                break;
            }
        }
        for (int left = 0, right = index - 1; left < right; left++, right--) {
            swap(nums, left, right);
        }
        return listToInt(nums);
    }

    private void swap(List<Integer> list, int i, int j) {
        int tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }

    private List<Integer> intToList(int n) {
        List<Integer> ans = new ArrayList<>();
        while (n > 0) {
            ans.add(n % 10);
            n /= 10;
        }
        return ans;
    }

    private int listToInt(List<Integer> nums) {
        long ans = 0;
        for (int i = nums.size() - 1; i >= 0; i--) {
            ans = 10 * ans + nums.get(i);
        }
        return ans > Integer.MAX_VALUE ? -1 : (int)ans;
    }

}
