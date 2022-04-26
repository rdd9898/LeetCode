package hy.day32;

import hy.day32.Solution;

public class Test {
    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        String answer = Solution.simplifyPath(path);
        System.out.println(answer);
    }
}
