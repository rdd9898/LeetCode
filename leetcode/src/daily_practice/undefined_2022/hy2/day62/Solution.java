package daily_practice.undefined_2022.hy2.day62;

import java.util.*;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年04月06日 9:36
 */
public class Solution {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        // 如果只有一个点说明他就说最小高度树
        if (n == 1) {
            res.add(0);
            return res;
        }
        // 建立各个节点的度表
        int[] degree = new int[n];
        // 建立图关系，在每个节点的list中存储相连节点
        List<List<Integer>> map = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            map.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            // 添加度
            degree[edge[0]]++;
            degree[edge[1]]++;
            // 添加链表
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        // 建立队列
        Queue<Integer> queue = new LinkedList<>();
        // 把所有度为1的节点 也就是叶子节点入队
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) {
                queue.offer(i);
            }
        }
        // 循环 队列不为空运行
        while (!queue.isEmpty()) {
            // 每层循环都有new一个新的结果集合，这样最后保存的就是最终的最小高度数
            res = new ArrayList<>();
            //每一层节点的数量
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                /*
                把当前节点加入结果集，不要有疑问，为什么当前只是叶子节点为什么要加入结果集呢?
                因为我们每次循环都会新建一个list，所以最后保存的就是最后一个状态下的叶子节点，
                这也是很多题解里面所说的剪掉叶子节点的部分，你可以想象一下图，每层遍历完，
                都会把该层（也就是叶子节点层）这一层从队列中移除掉，
                不就相当于把原来的图给剪掉一圈叶子节点，形成一个缩小的新的图吗
                */
                res.add(cur);
                // 经典bfs 把当前节点的相邻节点拿出
                List<Integer> neighbors = map.get(cur);
                for (Integer neighbor : neighbors) {
                    // 把相邻节点的度都减1，因为cur已经出队
                    degree[neighbor]--;
                    if (degree[neighbor] == 1) {
                        // 如果是相邻节点变成叶子节点了入队
                        queue.offer(neighbor);
                    }
                }
            }
        }
        // 返回最后一次保存的list
        return res;
    }

}
