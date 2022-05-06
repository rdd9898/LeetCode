package daily_practice.undefined_2022.hy3.day1;

//Hercy 想要为购买第一辆车存钱。他 每天 都往力扣银行里存钱。
//
//最开始，他在周一的时候存入 1 块钱。从周二到周日，他每天都比前一天多存入 1 块钱。在接下来每一个周一，他都会比 前一个周一 多存入 1 块钱。
//
//给你 n ，请你返回在第 n 天结束的时候他在力扣银行总共存了多少块钱。

public class Solution {
    public static int totalMoney(int n) {
        int weekMoney = 1 + 2 + 3 + 4 + 5 + 6 + 7;
        int answer = 0;

        for (int i = 0; i < n / 7; i++) {
            answer += weekMoney + i * 7;
        }
        for (int i = 1; i <= n % 7; i++) {
            answer += i + n / 7;
        }

        return answer;

    }
}
