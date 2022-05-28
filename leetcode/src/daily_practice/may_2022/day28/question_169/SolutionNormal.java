package daily_practice.may_2022.day28.question_169;

/**
 * Boyer-Moore 投票算法
 * @program: LeetCode
 * @description: 136.多数元素
 * @author: Mr.Hu
 * @create: 2022-05-28 13:14
 **/
public class SolutionNormal {

    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (candidate != num) count--;
            else count++;
        }

        return candidate;
    }

}
