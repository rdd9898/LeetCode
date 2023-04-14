package daily_practice.april_2023.day11.offer_35;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void copyRandomList() {
        Solution solution = new Solution();
        Solution.Node node1 = new Solution.Node(7);
        Solution.Node node2 = new Solution.Node(13);
        Solution.Node node3 = new Solution.Node(11);
        Solution.Node node4 = new Solution.Node(10);
        Solution.Node node5 = new Solution.Node(1);
        node1.next = node2;
        node1.random = null;
        node2.next = node3;
        node2.random = node1;
        node3.next = node4;
        node3.random = node5;
        node4.next = node5;
        node4.random = node3;
        node5.next = null;
        node5.random = node1;
        Solution.Node node = solution.copyRandomList(node1);

    }
}