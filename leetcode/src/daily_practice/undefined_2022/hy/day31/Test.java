package daily_practice.undefined_2022.hy.day31;

public class Test {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int answer = Solution.maxDepth(s);
        System.out.println(answer);
    }
}
