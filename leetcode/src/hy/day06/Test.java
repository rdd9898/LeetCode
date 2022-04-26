package hy.day06;

public class Test {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[] words = {"step","steps","stripe","stepple"};
//        String s = Solution.shortestCompletingWord(licensePlate, words);
        String s = NormalSolution.shortestCompletingWord(licensePlate, words);
        System.out.println(s);
    }
}
