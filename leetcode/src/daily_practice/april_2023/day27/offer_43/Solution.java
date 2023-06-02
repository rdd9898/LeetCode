package daily_practice.april_2023.day27.offer_43;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 43. 1～n 整数中 1 出现的次数
 * @author: Mr.Hu
 * @create: 2023-04-27 20:52
 **/
public class Solution {

    public int countDigitOne(int n) {
        if (n < 10) return 1;
        String s = String.valueOf(n);
        int ans = 0;
        int bais = 1;
        int cur = 1;
        while (cur < s.length()) {
            int tmp = Integer.parseInt(s.substring(0, s.length() - cur));
            if (s.charAt(s.length() - cur) > '1') ans += (tmp + 1) * bais;
            else if (s.charAt(s.length() - cur) == '0') ans += tmp * bais;
            else {
                ans += tmp * bais;
                if (cur == 1) ans += 1;
                else ans += Integer.parseInt(s.substring(s.length() - cur + 1)) + 1;
            }
            bais *= 10;
            cur++;
        }
        if (s.charAt(0) > '1') ans += bais;
        else ans += Integer.parseInt(s.substring(1)) + 1;
        return ans;
    }

}
