package daily_practice.undefined_2022.hy.day04;

public class Test {
    public static void main(String[] args) {
        int[][] grid =  {{1, 2, 1, 2, 1, 2}, {2, 2, 2, 2, 1, 2}, {1, 2, 2, 2, 1, 2}};
        int[][] gridColor;
        Solution solution = new Solution();
        gridColor = solution.colorBorder(grid, 1, 3, 1);
        int m = gridColor.length;
        int n = gridColor[0].length;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(grid[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
