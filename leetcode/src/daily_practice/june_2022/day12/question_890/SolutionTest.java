package daily_practice.june_2022.day12.question_890;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findAndReplacePattern() {

        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        Solution solution = new Solution();
        List<String> ans = solution.findAndReplacePattern(words, pattern);
        ans.forEach(System.out::println);

    }
}