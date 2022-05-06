package daily_practice.undefined_2022.hy3.day27;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/24 0:23
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static int[] findBall(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            ans[i] = 1;
        }
        for (int i = 0; i < m; i++) {

            int tmpI = i;
            int tmpJ = 0;

            for (int j = 0; j < n; j++) {



                if ((tmpI == 0 && grid[tmpJ][tmpI] == -1) || (tmpI == n - 1 && grid[tmpJ][tmpI] == 1)) {

                        ans[i] = -1;
                        break;

                } else {

                    if (grid[tmpJ][tmpI] == 1 ) {
                        if (grid[tmpJ][tmpI] == grid[tmpJ][tmpI + 1]) {
                            tmpJ++;
                            tmpI++;
                        } else {
                            ans[i] = -1;
                            break;
                        }
                    } else if (grid[tmpJ][tmpI] == -1) {
                        if (grid[tmpJ][tmpI] == grid[tmpJ][tmpI - 1]) {
                            tmpI--;
                            tmpJ++;
                        } else {
                            ans[i] = -1;
                            break;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
