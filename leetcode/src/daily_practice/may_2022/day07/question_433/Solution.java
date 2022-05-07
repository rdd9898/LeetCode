package daily_practice.may_2022.day07.question_433;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @program: LeetCode
 * @description: 433.最小基因变化
 * @author: Mr.Hu
 * @create: 2022-05-07 11:10
 **/
public class Solution {

    public int minMutation(String start, String end, String[] bank) {
        // 字符串长度
        int m = start.length();
        // 数组 bank 大小
        int n = bank.length;
        // 初始化了一个长度为 n 的数组，数组元素为 list<Integer> 集合
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        // endIndex 为 end 所在 bank 的索引
        int endIndex = -1;
        // 在 adj 数组中记录 bank[i] 能只改变一位 char 变成 bank 另一元素的记录
        for (int i = 0; i < n; i++) {
            if (end.equals(bank[i])) {
                endIndex = i;
            }
            for (int j = i + 1; j < n; j++) {
                int mutations = 0;
                for (int k = 0; k < m; k++) {
                    if (bank[i].charAt(k) != bank[j].charAt(k)) {
                        mutations++;
                    }
                    if (mutations > 1) {
                        break;
                    }
                }
                if (mutations == 1) {
                    adj[i].add(j);
                    adj[j].add(i);
                }
            }
        }
        // 如果 bank 中不包含 end，直接返回 -1
        if (endIndex == -1) {
            return -1;
        }

        Queue<Integer> queue = new ArrayDeque<Integer>();
        boolean[] visited = new boolean[n];
        int step = 1;

        // 找出与 start 一位 char 改变的情况添加到队列中，广度优先搜索
        for (int i = 0; i < n; i++) {
            int mutations = 0;
            for (int k = 0; k < m; k++) {
                if (start.charAt(k) != bank[i].charAt(k)) {
                    mutations++;
                }
                // 两位及两位以上 char 改变直接结束该循环
                if (mutations > 1) {
                    break;
                }
            }
            // 将一位 char 改变的字符串的索引添加到队列中，且标记该情况
            if (mutations == 1) {
                queue.offer(i);
                visited[i] = true;
            }
        }
        // 广度优先搜索
        while (!queue.isEmpty()) {
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                int curr = queue.poll();
                // 如果当前字符串索引等于 end 字符串索引，直接返回 step
                if (curr == endIndex) {
                    return step;
                }
                // 查找与 curr 发生一位改变所有字符串索引
                for (int next : adj[curr]) {
                    // 如果该字符串被标记就跳过
                    if (visited[next]) {
                        continue;
                    }
                    // 标记未被标记的字符串
                    visited[next] = true;
                    // 在队列中添加该字符串索引
                    queue.offer(next);
                }
            }
            // 改变一位字符串，step 加 1
            step++;
        }
        // start 无法变成 end
        return -1;
    }

}
