package daily_practice.june_2023.day05.offer_ii_059;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 059. 数据流的第 K 大数值
 * @author: Mr.Hu
 * @create: 2023-06-05 20:08
 **/
public class KthLargest {

    List<Integer> list;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        list = new ArrayList<>();
        Arrays.sort(nums);
        int index = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            list.add(index, nums[i]);
            index++;
            if (index == k) break;
        }
        if (index != k) {
            list.add(Integer.MIN_VALUE);
        }
    }

    public int add(int val) {
        int left = 0;
        int right = k;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) >= val) left = mid + 1;
            else right = mid;
        }
        if (left < k) {
            list.add(left, val);
            list.remove(list.size() - 1);
        }
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(3, nums);
        kthLargest.add(3);
        kthLargest.add(5);
        kthLargest.add(10);
        kthLargest.add(9);
        kthLargest.add(4);
    }
}
