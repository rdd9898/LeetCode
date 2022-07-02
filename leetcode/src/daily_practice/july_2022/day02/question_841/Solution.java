package daily_practice.july_2022.day02.question_841;

import java.util.List;

/**
 * @program: LeetCode
 * @description: 841.钥匙和房间
 * @author: Mr.Hu
 * @create: 2022-07-02 11:13
 **/
public class Solution {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] flags = new boolean[rooms.size()];
        dfs(0, rooms, flags);
        for (boolean flag: flags) {
            if (!flag) {
                return false;
            }
        }
        return true;
    }

    public void dfs(int room, List<List<Integer>> rooms, boolean[] flags) {
        if (flags[room]) {
            return;
        }
        flags[room] = true;
        for (int temp: rooms.get(room)) {
            dfs(temp, rooms, flags);
        }
    }

}
