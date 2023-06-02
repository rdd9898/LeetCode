package daily_practice.may_2023.day17.question_2446;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void haveConflict() {
        String[] event1 = {"a", "b"};
        String[] event2 = {"b", "c"};
        Solution solution = new Solution();
        boolean ans = solution.haveConflict(event1, event2);
        System.out.println(ans);
    }
}