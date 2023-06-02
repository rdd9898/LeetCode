package daily_practice.april_2023.day19.offer_64;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 64. 求1+2+…+n
 * @author: Mr.Hu
 * @create: 2023-04-19 19:51
 **/
public class Solution {

    int ans = 0;

    public int sumNums(int n) {
        boolean flag = n > 1 && sumNums(n - 1) > 0;
        ans += n;
        return ans;
    }

}
