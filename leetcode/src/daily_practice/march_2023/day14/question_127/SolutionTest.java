package daily_practice.march_2023.day14.question_127;

import Algorithm.Introduction_to_algorithms.tenth_chapter.List;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void ladderLength() {
        Solution solution = new Solution();

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        int ans = solution.ladderLength("hit", "cog", wordList);
        System.out.println(ans);
    }
}