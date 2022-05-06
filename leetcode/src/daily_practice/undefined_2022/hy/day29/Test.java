package daily_practice.undefined_2022.hy.day29;

public class Test {
    public static void main(String[] args) {
        int[] releaseTimes = {9,29,49,50};
        String keysPressed = "cbcd";
        char answer = Solution.slowestKey(releaseTimes, keysPressed);
        System.out.println(answer);

    }
}
