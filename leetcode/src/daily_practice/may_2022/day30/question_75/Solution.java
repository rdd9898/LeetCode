package daily_practice.may_2022.day30.question_75;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 75.颜色分类
 * @date 2022年05月30日 9:07
 */
public class Solution {

    public void sortColors(int[] nums) {
        int redIndex = 0;
        int whiteIndex = 0;
        int blueIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                whiteIndex++;
            } else if (nums[i] == 1) {
                blueIndex++;
            }
        }
        blueIndex += whiteIndex;
        int tmp = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i < whiteIndex) {
                nums[i] = 0;
            } else if (i < blueIndex) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }

}
