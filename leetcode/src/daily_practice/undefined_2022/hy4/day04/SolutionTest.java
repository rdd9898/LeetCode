package daily_practice.undefined_2022.hy4.day04;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void lengthLongestPath() {
        String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        Solution solution = new Solution();
        int ans = solution.lengthLongestPath(input);
        System.out.println(ans);
    }
}