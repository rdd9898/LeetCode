package daily_practice.may_2022.day11.question_744;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 744.寻找比目标字母大的最小字母
 * @date 2022年05月11日 10:03
 */
public class Solution {

    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target - letters[mid] > 0) {
                left = mid + 1;
            } else if (target - letters[mid] < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left == letters.length) {
            return letters[0];
        } else {
            return letters[left];
        }
    }

}
