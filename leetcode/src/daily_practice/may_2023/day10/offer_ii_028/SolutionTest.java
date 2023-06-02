package daily_practice.may_2023.day10.offer_ii_028;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void flatten() {
        Solution.Node node1 = new Solution.Node(1);
        Solution.Node node2 = new Solution.Node(2);
        Solution.Node node3 = new Solution.Node(3);
        node1.child = node2;
        node2.child = node3;
        Solution solution = new Solution();
        Solution.Node ans = solution.flatten(node1);
    }
}