package daily_practice.undefined_2022.hy4.day16;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void reorderLogFiles() {

        String[] logs = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo","a2 act car"};
        Solution solution = new Solution();
        String[] strings = solution.reorderLogFiles(logs);
        for (String string : strings) {
            System.out.println(string);
        }

    }
}