package hy.day14;

//419.甲板上的战舰

//给你一个大小为 m x n 的矩阵 board 表示甲板，其中，每个单元格可以是一艘战舰 'X' 或者是一个空位 '.' ，返回在甲板 board 上放置的 战舰 的数量。
//
//战舰 只能水平或者垂直放置在 board 上。换句话说，战舰只能按 1 x k（1 行，k 列）或 k x 1（k 行，1 列）的形状建造，其中 k 可以是任意大小。两艘战舰之间至少有一个水平或垂直的空位分隔 （即没有相邻的战舰）。

//题目要求找到矩阵中战舰的数量，战舰用 ’X’ 表示，空位用 ’.’，而矩阵中的战舰的满足以下两个条件：
//
//战舰只能水平或者垂直放置。战舰只能由子矩阵 1×N（1 行，N 列）组成，或者子矩阵 N×1（N 行, 1 列）组成，其中 N 可以是任意大小。
//两艘战舰之间至少有一个水平或垂直的空位分隔，没有相邻的战舰。
//我们遍历矩阵中的每个位置 (i,j)(i,j) 且满足 board[i][j]=’X’，并将以 (i,j)(i,j) 为起点的战舰的所有位置均设置为空位，从而我们即可统计出所有可能的战舰。

public class Solution {
    public static int countBattleships(char[][] board) {
        int x = board.length;
        int y = board[0].length;

        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (board[i][j] == 'X') {
                    board[i][j] = '.';
                    for (int k = j + 1; k < y && board[i][k] == 'X'; k++) {
                        board[i][k] = '.';
                    }
                    for (int k = i + 1; k < x && board[k][j] == 'X'; k++) {
                        board[k][j] = '.';
                    }
                    count++;
                }
            }
        }
        return count;
    }
}
