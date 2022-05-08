package weekly_race.week_292.question_6058;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 6058.统计打字方案数
 * @date 2022年05月08日 11:27
 */
public class Solution {

    static int N = 100010;
    static long[] three = new long[N];
    static long[] four = new long[N];
    static int MOD = 1000000007;

    static {
        three[0] = 1;
        three[1] = 1;
        three[2] = 2;
        three[3] = 4;
        four[0] = 1;
        four[1] = 1;
        four[2] = 2;
        four[3] = 4;
        for (int i = 4; i < N; i++) {
            three[i] = three[i - 1] + three[i - 2] + three[i - 3];
            three[i] %= MOD;
            four[i] = four[i - 1] + four[i - 2] + four[i - 3] + four[i - 4];
            four[i] %= MOD;
        }
    }

    public int countTexts(String pressedKeys) {
        long ans = 1;
        int number = 1;
        char c = pressedKeys.charAt(0);
        for (int i = 1; i < pressedKeys.length() + 1; i++) {
            if (i < pressedKeys.length() && pressedKeys.charAt(i) == c) {
                number++;
            } else if (i == pressedKeys.length() || pressedKeys.charAt(i) != c){
                boolean isFour = pressedKeys.charAt(i - 1) == '7' || pressedKeys.charAt(i - 1) == '9';
                long cur = isFour ? four[number] : three[number];
                ans = (ans * cur) % MOD;
                if (i < pressedKeys.length()) {
                    c = pressedKeys.charAt(i);
                    number = 1;
                }
            }
        }
        return (int) ans;
    }

}
