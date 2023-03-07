package daily_practice.march_2023.day07.question_2457;

/**
 * @program: LeetCode
 * @description: 2457.美丽整数的最小增量
 * @author: Mr.Hu
 * @create: 2023-03-07 21:44
 **/
public class Solution {

    public long makeIntegerBeautiful(long n, int target) {
        if (judge(n, target)) return 0;
        long ans = 0;
        long i = 10;
        while (!judge(n, target)) {
            long lastN = n;
            n = (n / i + 1) * i;
            i = i * 10;
            ans += n - lastN;
        }
        return ans;
    }

    //判断一个数的所有位加起来是不是 <= target
    public static boolean judge(long x, int target){
        long sum = 0;
        while(x != 0){
            sum += x%10;
            x = x/10;
        }
        return sum<=target? true:false;
    }


}
