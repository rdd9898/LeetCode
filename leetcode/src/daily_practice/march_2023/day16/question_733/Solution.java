package daily_practice.march_2023.day16.question_733;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 733.图像渲染
 * @author: Mr.Hu
 * @create: 2023-03-16 21:42
 **/
public class Solution {

    int m;
    int n;
    int[][] steps = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        m = image.length;
        n = image[0].length;
        boolean[][] flag = new boolean[m][n];
        int target = image[sr][sc];
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offerFirst(new int[]{sr, sc});
        image[sr][sc] = color;
        flag[sr][sc] = true;
        while (deque.size() != 0) {
            int[] cur = deque.pollFirst();
            for (int[] step : steps) {
                if (cur[0] + step[0] < 0 || cur[0] + step[0] >= m || cur[1] + step[1] < 0 || cur[1] + step[1] >= n || image[cur[0] + step[0]][cur[1] + step[1]] != target || flag[cur[0] + step[0]][cur[1] + step[1]]) continue;
                deque.offerLast(new int[]{cur[0] + step[0], cur[1] + step[1]});
                image[cur[0] + step[0]][cur[1] + step[1]] = color;
                flag[cur[0] + step[0]][cur[1] + step[1]] = true;
            }
        }
        return image;
    }

}
