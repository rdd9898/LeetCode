package daily_practice.may_2022.day12.question_1346;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void checkIfExist() {

        int[] arr = {-766,259,203,601,896,-226,-844,168,126,-542,159,-833,950,-454,-253,824,-395,155,94,894,-766,-63,836,-433,-780,611,-907,695,-395,-975,256,373,-971,-813,-154,-765,691,812,617,-919,-616,-510,608,201,-138,-669,-764,-77,-658,394,-506,-675,523};
        Solution solution = new Solution();
        boolean ans = solution.checkIfExist(arr);
        System.out.println(ans);

    }
}