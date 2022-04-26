package hy.day09;

public class Test {
    public static void main(String[] args) {
        int[][]  grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        int answer = Solution.maxIncreaseKeepingSkyline(grid);
        System.out.println(answer);
    }
}
