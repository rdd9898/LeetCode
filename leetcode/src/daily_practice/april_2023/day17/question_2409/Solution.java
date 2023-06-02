package daily_practice.april_2023.day17.question_2409;

/**
 * @program: LeetCode
 * @description: 2409. 统计共同度过的日子数
 * @author: Mr.Hu
 * @create: 2023-04-17 14:43
 **/
public class Solution {

    int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String[] arriveA = arriveAlice.split("-");
        String[] leaveA = leaveAlice.split("-");
        String[] arriveB = arriveBob.split("-");
        String[] leaveB = leaveBob.split("-");
        int aliceA = calculate(arriveA);
        int aliceL = calculate(leaveA);
        int bobA = calculate(arriveB);
        int bobL = calculate(leaveB);
        int max = Integer.max(aliceA, bobA);
        int min = Integer.min(aliceL, bobL);
        int ans = min - max + 1;
        return Integer.max(0, ans);
    }

    private int calculate(String[] arrive) {
        int ans = 0;
        for (int i = 0; i < Integer.parseInt(arrive[0]) - 1; i++) {
            ans += months[i];
        }
        ans += Integer.parseInt(arrive[1]);
        return ans;
    }

}
