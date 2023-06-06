package daily_practice.june_2023.day06.offer_ii_063;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void replaceWords() {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");
        String sentence = "the cattle was rattled by the battery";
        Solution solution = new Solution();
        String ans = solution.replaceWords(dictionary, sentence);
        System.out.println(ans);
    }
}