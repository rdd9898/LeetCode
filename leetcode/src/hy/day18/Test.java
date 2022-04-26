package hy.day18;

public class Test {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";
        Solution solution = new Solution();
        int answer = solution.repeatedStringMatch(a, b);
        System.out.println(answer);
    }
}
