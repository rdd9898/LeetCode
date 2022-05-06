package daily_practice.undefined_2022.hy.day32;

public class Test {
    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        String answer = Solution.simplifyPath(path);
        System.out.println(answer);
    }
}
