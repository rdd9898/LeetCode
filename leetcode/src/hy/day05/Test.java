package hy.day05;

public class Test {
    public static void main(String[] args) {
        String[] board = {"oxo", "  x", "  x"};
        boolean answer = Solution.validTicTacToe(board);
        System.out.println(answer);
    }
}
