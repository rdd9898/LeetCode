package daily_practice.july_2022.day02.question_872;

import java.util.PriorityQueue;

/**
 * @program: LeetCode
 * @description: 871.最低加油次数
 * @author: Mr.Hu
 * @create: 2022-07-02 11:11
 **/
public class Solution {

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int ans = 0;
        int prev = 0;
        int fuel = startFuel;
        int n = stations.length;
        for (int i = 0; i <= n; i++) {
            int curr = i < n ? stations[i][0] : target;
            fuel -= curr - prev;
            while (fuel < 0 && !pq.isEmpty()) {
                fuel += pq.poll();
                ans++;
            }
            if (fuel < 0) {
                return -1;
            }
            if (i < n) {
                pq.offer(stations[i][1]);
                prev = curr;
            }
        }
        return ans;
    }

}
