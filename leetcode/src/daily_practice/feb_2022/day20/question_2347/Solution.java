package daily_practice.feb_2022.day20.question_2347;

/**
 * @program: LeetCode
 * @description: 2347.最好的扑克手牌
 * @author: Mr.Hu
 * @create: 2023-02-20 21:26
 **/
public class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        boolean flag = false;
        char preSuit = suits[0];
        for (char suit : suits) {
            if (preSuit != suit) {
                flag = false;
                break;
            }
            flag = true;
        }
        if (flag) {
            return "Flush";
        }
        int nums[][] = new int[5][2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                if (ranks[i] == nums[j][0] && i != j) {
                    nums[j][1]++;
                    break;
                } else if (i == j){
                    nums[j][0] = ranks[j];
                    nums[j][1]++;
                }
            }
        }
        int maxNum = 0;
        for (int[] num : nums) {
            if (num[1] > maxNum) {
                maxNum = num[1];
            }
        }
        if (maxNum >= 3) {
            return "Three of a Kind";
        } else if (maxNum == 2) {
            return "Pair";
        } else {
            return "High Card";
        }
    }
}
