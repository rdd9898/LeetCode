package daily_practice.march_2023.day14.question_547;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findCircleNum() {
        Solution solution = new Solution();
        int[][] isConnected = {{1,1,0}, {1,1,0}, {0,0,1}};
        int ans = solution.findCircleNum(isConnected);
        System.out.println(ans);
    }
}