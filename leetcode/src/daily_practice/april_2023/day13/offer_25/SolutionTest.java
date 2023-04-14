package daily_practice.april_2023.day13.offer_25;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void mergeTwoLists() {
        Solution.ListNode node1 = new Solution.ListNode(-10);
        Solution.ListNode node2 = new Solution.ListNode(-9);
        Solution.ListNode node3 = new Solution.ListNode(-6);
        Solution.ListNode node4 = new Solution.ListNode(-4);
        Solution.ListNode node5 = new Solution.ListNode(1);
        Solution.ListNode node6 = new Solution.ListNode(9);
        Solution.ListNode node7 = new Solution.ListNode(9);
        Solution.ListNode node8 = new Solution.ListNode(-5);
        Solution.ListNode node9 = new Solution.ListNode(-3);
        Solution.ListNode node10 = new Solution.ListNode(0);
        Solution.ListNode node11 = new Solution.ListNode(7);
        Solution.ListNode node12 = new Solution.ListNode(8);
        Solution.ListNode node13 = new Solution.ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;
        Solution solution = new Solution();
        Solution.ListNode listNode = solution.mergeTwoLists(node1, node8);
    }
}