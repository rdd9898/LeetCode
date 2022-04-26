package hy.day04;
//1034.边界着色
//给你一个大小为 m x n 的整数矩阵 grid ，表示一个网格。另给你三个整数row、col 和 color 。网格中的每个值表示该位置处的网格块的颜色。
//
//当两个网格块的颜色相同，而且在四个方向中任意一个方向上相邻时，它们属于同一 连通分量 。
//
//连通分量的边界 是指连通分量中的所有与不在分量中的网格块相邻（四个方向上）的所有网格块，或者在网格的边界上（第一行/列或最后一行/列）的所有网格块。
//
//请你使用指定颜色color 为所有包含网格块grid[row][col] 的 连通分量的边界 进行着色，并返回最终的网格grid 。

//第一次自己写出的题 哈哈
public class Solution {

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        int color2 = grid[row][col];
        int m = grid.length;
        int n = grid[0].length;
        int[][] flag = new int[m][n];
        int[][] gridCopy = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                gridCopy[i][j] = grid[i][j];
            }
        }

        color(grid, gridCopy, row, col, color, color2, flag, m, n);

        return grid;
    }
    public void color(int[][] grid, int[][] gridCopy, int row, int col, int color, int color2, int[][] flag, int m, int n) {
        if (flag[row][col] == 1) {
            return;
        }
        flag[row][col] = 1;

        if (row > 0 && row < m-1 && col > 0 && col <n-1) {
            if (gridCopy[row-1][col] == color2 && gridCopy[row+1][col] == color2 && gridCopy[row][col-1] == color2 && gridCopy[row][col+1] == color2) {
                if (gridCopy[row - 1][col] == color2) {
                    row--;
                    color(grid, gridCopy, row, col, color, color2, flag, m, n);
                    row++;
                }
                if (gridCopy[row + 1][col] == color2) {
                    row++;
                    color(grid, gridCopy, row, col, color, color2, flag, m, n);
                    row--;
                }
                if (gridCopy[row][col - 1] == color2) {
                    col--;
                    color(grid, gridCopy, row, col, color, color2, flag, m, n);
                    col++;
                }
                if (gridCopy[row][col + 1] == color2) {
                    col++;
                    color(grid, gridCopy, row, col, color, color2, flag, m, n);
                    col--;
                }
            }
            else {
                grid[row][col] = color;
                if (gridCopy[row - 1][col] == color2) {
                    row--;
                    color(grid, gridCopy, row, col, color, color2, flag, m, n);
                    row++;
                }
                if (gridCopy[row + 1][col] == color2) {
                    row++;
                    color(grid, gridCopy, row, col, color, color2, flag, m, n);
                    row--;
                }
                if (gridCopy[row][col - 1] == color2) {
                    col--;
                    color(grid, gridCopy, row, col, color, color2, flag, m, n);
                    col++;
                }
                if (gridCopy[row][col + 1] == color2) {
                    col++;
                    color(grid, gridCopy, row, col, color, color2, flag, m, n);
                    col--;
                }
            }
        }
        else {
            grid[row][col] = color;
            if (row-1 >= 0) {
                if (gridCopy[row-1][col] == color2){
                    row--;
                    color(grid, gridCopy, row, col, color, color2, flag, m, n);
                    row++;
                }
            }
            if (row+1 < m) {
                if (gridCopy[row+1][col] == color2) {
                    row++;
                    color(grid, gridCopy, row, col, color, color2, flag, m, n);
                    row--;
                }
            }
            if (col-1 >= 0) {
                if (gridCopy[row][col-1] == color2) {
                    col--;
                    color(grid, gridCopy, row, col, color, color2, flag, m, n);
                    col++;
                }
            }
            if (col+1 < n) {
                if (gridCopy[row][col+1] == color2) {
                    col++;
                    color(grid, gridCopy, row, col, color, color2, flag, m, n);
                    col--;
                }
            }
        }
    }
}
