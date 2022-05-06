package daily_practice.undefined_2022.hy4.day14;

import java.util.PriorityQueue;

/**
 * @program: LeetCode
 * @description: 2233.K次增加后的最大乘积
 * @author: Mr.Hu
 * @create: 2022-05-01 22:37
 **/
public class Solution {

    private static final int MOD = 1000000007;
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num: nums) {
            pq.offer(num);
        }
        while(k-- > 0){
            int top = pq.poll();
            top++;
            pq.offer(top);
        }
        long ans = 1;
        while(!pq.isEmpty()){
            ans = (ans * pq.poll()) % MOD;
        }
        return (int)ans;
    }

}
