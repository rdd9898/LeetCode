package daily_practice.march_2023.day06.question_1653;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minimumDeletions() {

        Solution solution = new Solution();
        int ans = solution.minimumDeletions("ababaaaabbbbbaaababbbbbbaaabbaababbabbbbaabbbbaabbabbabaabbbababaa");
        System.out.println(ans);

    }
}