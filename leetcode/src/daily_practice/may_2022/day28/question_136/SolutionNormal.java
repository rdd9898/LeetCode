package daily_practice.may_2022.day28.question_136;

/**
 * 通过异或解决，出现过两次的数字异或结果为 0，0 和出现过一次数字异或结果为该数字
 * @program: LeetCode
 * @description: 136.只出现一次的数字
 * @author: Mr.Hu
 * @create: 2022-05-28 12:50
 **/
public class SolutionNormal {

    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

}
