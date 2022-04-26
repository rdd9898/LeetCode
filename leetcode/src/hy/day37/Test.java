package hy.day37;

import java.util.List;

/**
 * @author 胡阳
 * @ClassName Test
 * @description:
 * @date 2022年01月14日 10:53
 */
public class Test {
    /**
     * @Description:
     * @Param: [args]
     * @return: void
     * @Author: HuYang
     * @Date:2022/1/14 10:53
     */
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3};
        int k = 3;
        List<List<Integer>> answers = Solution.kSmallestPairs(nums1, nums2, k);
        for (List<Integer> answer: answers) {
            for (Integer i: answer) {
                System.out.println(i);
            }
            System.out.println("--");
        }
    }
}
