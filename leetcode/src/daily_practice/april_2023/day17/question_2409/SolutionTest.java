package daily_practice.april_2023.day17.question_2409;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void countDaysTogether() {

        String arriveAlice = "08-15";
        String leaveAlice = "08-18";
        String arriveBob = "08-16";
        String leaveBob = "08-19";
        Solution solution = new Solution();
        int ans = solution.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob);
        System.out.println(ans);

    }
}