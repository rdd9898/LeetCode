package hy.day14;

public class Test {
    public static void main(String[] args) {
        char[][] board = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
        int answer = Solution.countBattleships(board);
        System.out.println(answer);
    }
}
