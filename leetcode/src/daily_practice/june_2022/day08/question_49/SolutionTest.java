package daily_practice.june_2022.day08.question_49;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void groupAnagrams() {

        String[] strs = {"bdddddddddd","bbbbbbbbbbc"};
        Solution solution = new Solution();
        List<List<String>> ans = solution.groupAnagrams(strs);
        ans.forEach(System.out::println);

    }
}