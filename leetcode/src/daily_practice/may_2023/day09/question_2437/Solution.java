package daily_practice.may_2023.day09.question_2437;

/**
 * @program: LeetCode
 * @description: 2437. 有效时间的数目
 * @author: Mr.Hu
 * @create: 2023-05-09 10:08
 **/
public class Solution {

    public int countTime(String time) {
        int ans = 1;
        if (time.charAt(4) == '?') ans *= 10;
        if (time.charAt(3) == '?') ans *= 6;
        if (time.charAt(1) == '?') {
            if (time.charAt(0) == '2') ans *= 4;
            else if (time.charAt(0) == '?') return 24 * ans;
            else ans *= 10;
        }
        if (time.charAt(0) == '?') {
            if (time.charAt(1) - '0' > 3) {
                ans *= 2;
            } else ans *= 3;
        }

        return ans;
    }

}
