package daily_practice.undefined_2022.hy.day25;

public class Test {
    public static void main(String[] args) {
        int[] hand = {1,2,3,4,8};
        int groupSize = 4;
        boolean answer = Solution.isNStraightHand(hand, groupSize);
        System.out.println(answer);
    }
}
