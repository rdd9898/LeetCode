package hy.day11;

//我们可以根据 richer 构建一张有向图：把人看成点，如果 a_i 比 b_i 更有钱，那么就从 b_i 向 a_i 连一条有向边。由于题目保证 richer 中所给出的数据逻辑自恰，我们得到的是一张有向无环图。
//
//因此我们从图上任意一点（设为 x）出发，沿着有向边所能访问到的点，都比 x 更有钱。
//
//题目需要计算拥有的钱肯定不少于 x 的人中，最安静的人。我们可以分为拥有的钱肯定与 x 相等，以及拥有的钱肯定比 x 多两种情况。对于前者，根据题目所给信息，我们只知道 x 拥有的钱肯定与自己相等，无法知道是否有其他人拥有的钱肯定与 x 相等；对于后者，我们可以先计算出 x 的邻居的 answer 值，再取这些 answer 值中的最小值为结果，这是因为从 x 的邻居出发所能访问到的点，并上 x 的邻居后所得到的点集，就是从 x 出发所能访问到的点。总的来说，最安静的人要么是 x 自己，要么是 x 的邻居的 answer 中最安静的人。
//
//计算 x 的每个邻居的 answer 值是一个递归的过程，我们可以用深度优先搜索来实现。为避免重复运算，在已经计算出 answer[x] 的情况下可以直接返回。



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NormalSolution {

    class Solution {
        public int[] loudAndRich(int[][] richer, int[] quiet) {
            int n = quiet.length;
            List<Integer>[] g = new List[n];
            for (int i = 0; i < n; ++i) {
                g[i] = new ArrayList<Integer>();
            }
            for (int[] r : richer) {
                g[r[1]].add(r[0]);
            }

            int[] ans = new int[n];
            Arrays.fill(ans, -1);
            for (int i = 0; i < n; ++i) {
                dfs(i, quiet, g, ans);
            }
            return ans;
        }

        public void dfs(int x, int[] quiet, List<Integer>[] g, int[] ans) {
            if (ans[x] != -1) {
                return;
            }
            ans[x] = x;
            for (int y : g[x]) {
                dfs(y, quiet, g, ans);
                if (quiet[ans[y]] < quiet[ans[x]]) {
                    ans[x] = ans[y];
                }
            }
        }
    }

}
