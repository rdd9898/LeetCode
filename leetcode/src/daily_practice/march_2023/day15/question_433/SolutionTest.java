package daily_practice.march_2023.day15.question_433;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minMutation() {

        Solution solution = new Solution();
        String[] bank = {"AACCGGTA","AACCGCTA","AAACGGTA"};
        int ans = solution.minMutation("AACCGGTT", "AAACGGTA", bank);
        System.out.println(ans);

    }
}