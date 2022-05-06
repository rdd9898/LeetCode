package hy4.day22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 933.最近的请求次数
 * @date 2022年05月06日 8:54
 */
public class RecentCounter {

    ArrayList<Integer> list;

    public RecentCounter() {
        list = new ArrayList<>();

    }

    public int ping(int t) {
        int ans = 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (t - list.get(i) <= 3000) {
                ans++;
            } else {
                break;
            }
        }
        list.add(t);
        return ans;
    }

}
