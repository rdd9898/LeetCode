package daily_practice.may_2022.day09.question_893;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void numSpecialEquivGroups() {

        String[] words = {"abcd","cdab","cbad","xyzz","zzxy","zzyx"};
        Solution solution = new Solution();
        int ans = solution.numSpecialEquivGroups(words);
        System.out.println(ans);

    }
}