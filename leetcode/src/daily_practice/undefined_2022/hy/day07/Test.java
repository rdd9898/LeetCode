package daily_practice.undefined_2022.hy.day07;

public class Test {
    public static void main(String[] args) {
        int[] persons = {0, 1, 1, 0, 0, 1, 0};
        int[] times = {0, 5, 10, 15, 20, 25, 30};
        Solution solution = new Solution(persons, times);
        System.out.println(solution.q(1));
    }
}
