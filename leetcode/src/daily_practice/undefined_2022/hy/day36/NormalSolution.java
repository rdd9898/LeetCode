package daily_practice.undefined_2022.hy.day36;

//方法一：遍历
//思路与算法
//遍历数组分别找到数组的最大值 m_1 和次大值 m_2 。如果 m_1 ≥ m_2 × 2 成立，则最大值至少是数组其余数字的两倍，此时返回最大值的下标，否则返回 -1−1。
//
//为了返回最大值的下标，我们需要在计算最大值的同时记录最大值的下标。

public class NormalSolution {
    /**
     * @Description:
     * @Param: [nums]
     * @return: int
     * @Author: HuYang
     * @Date:2022/1/13 19:07
     */
    public static int dominantIndex(int[] nums) {
        int m1 = -1, m2 = -1;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > m1) {
                m2 = m1;
                m1 = nums[i];
                index = i;
            } else if (nums[i] > m2) {
                m2 = nums[i];
            }
        }
        return m1 >= m2 * 2 ? index : -1;
    }
}
