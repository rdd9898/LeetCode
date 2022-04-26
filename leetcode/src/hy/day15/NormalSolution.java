package hy.day15;

//题干描述了一个有向图。每个人是图的节点，trust 的元素 trust[i] 是图的有向边，从 \trust[i][0] 指向 trust[i][1]。我们可以遍历 trust，统计每个节点的入度和出度，存储在 inDegrees 和 outDegrees 中。
//
//根据题意，在法官存在的情况下，法官不相信任何人，每个人（除了法官外）都信任法官，且只有一名法官。因此法官这个节点的入度是 n-1, 出度是 0。
//
//我们可以遍历每个节点的入度和出度，如果找到一个符合条件的节点，由于题目保证只有一个法官，我们可以直接返回结果；如果不存在符合条件的点，则返回 −1。

public class NormalSolution {
    public static int findJudge(int n, int[][] trust) {
        int[] inDegrees = new int[n + 1];
        int[] outDegrees = new int[n + 1];
        for (int[] edge : trust) {
            int x = edge[0], y = edge[1];
            ++inDegrees[y];
            ++outDegrees[x];
        }
        for (int i = 1; i <= n; ++i) {
            if (inDegrees[i] == n - 1 && outDegrees[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
