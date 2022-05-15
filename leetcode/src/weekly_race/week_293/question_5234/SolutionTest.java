package weekly_race.week_293.question_5234;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void removeAnagrams() {

        String[] words = {"a","b","c","d","e"};
        Solution solution = new Solution();
        List<String> list = solution.removeAnagrams(words);
        list.forEach(System.out::println);

    }
}