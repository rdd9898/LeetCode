package daily_practice.undefined_2022.hy.day03;

public class Test {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
//        String sNew = Solution.truncateSentence(s, k);
        String sNew = NormalSolution.truncateSentence(s, k);
        System.out.println(sNew);
    }
}
