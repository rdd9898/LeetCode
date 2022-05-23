package daily_practice.may_2022.day23.question_675;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void cutOffTree() {
        List<List<Integer>> forest = new ArrayList<>();
        List<Integer> objects1 = new ArrayList<>();
        List<Integer> objects2 = new ArrayList<>();
        List<Integer> objects3 = new ArrayList<>();
        objects1.add(1);
        objects1.add(2);
        objects1.add(3);
        objects2.add(0);
        objects2.add(0);
        objects2.add(4);
        objects3.add(7);
        objects3.add(6);
        objects3.add(5);
        forest.add(objects1);
        forest.add(objects2);
        forest.add(objects3);
        Solution solution = new Solution();
        int ans = solution.cutOffTree(forest);
        System.out.println(ans);
    }
}