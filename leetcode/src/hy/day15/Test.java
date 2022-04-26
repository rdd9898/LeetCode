package hy.day15;


public class Test {
    public static void main(String[] args) {
        int n = 4;
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        int judge = NormalSolution.findJudge(n, trust);
        System.out.println(judge);
    }
}
