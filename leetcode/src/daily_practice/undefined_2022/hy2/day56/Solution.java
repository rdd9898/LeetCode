package daily_practice.undefined_2022.hy2.day56;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年03月30日 9:57
 */
public class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        List<Integer> ans = new ArrayList<>();
        int[] nums = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < arrival.length; i++) {
            //按照索引查找可以进入的服务器
            for (int j = 0, n = i; j < k; j++) {
                //此时要查看的服务器编号
                n = n % k;
                //如果到达时间大于等于n编号服务器完成任务的时间，该请求则被该服务器处理
                if (arrival[i] >= map.get(n)) {
                    //修改服务器完成请求时间
                    map.put(n, arrival[i] + load[i]);
                    //同时记录每个服务器处理请求的数量
                    nums[n]++;
                    break;
                } else {
                    //该服务器不能请求则查看下个服务器
                    n++;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            if (nums[i] > max) {
                ans.clear();
                ans.add(i);
                max = nums[i];
            } else if (nums[i] == max) {
                ans.add(i);
            }
        }
        return ans;
    }
}
