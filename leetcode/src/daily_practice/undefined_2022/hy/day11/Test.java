package daily_practice.undefined_2022.hy.day11;

public class Test {
    public static void main(String[] args) {
        int[][] richer = {{0, 1}, {0, 2}};
        int[] quiet = {0, 1, 2};
        int[] answers = Solution.loudAndRich(richer, quiet);
        for (int answer: answers) {
            System.out.println(answer);
        }
    }
}
