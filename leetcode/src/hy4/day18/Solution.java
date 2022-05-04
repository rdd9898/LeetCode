package hy4.day18;

import java.util.LinkedList;
import java.util.List;

/**
 * 通过 list 集合，通过索引方式排除游戏失败者
 * @author 胡阳
 * @ClassName Solution
 * @description: 1823.找出游戏的获胜者
 * @date 2022年05月04日 9:17
 */
public class Solution {

    public int findTheWinner(int n, int k) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        // 初始化设为 1，因为索引从 0 开始
        int leave = -1;

        while (n > 1) {
            // 获得失败人在 list 中的索引
            leave += k;
            leave = leave % list.size();


            // 删除失败的人，当前索引 -1 ，当前游戏人员 -1
            // 因为少了一个人，所以索引要前置 1 位
            list.remove(leave);
            leave--;
            n--;

        }
        return list.get(0);
    }

}
