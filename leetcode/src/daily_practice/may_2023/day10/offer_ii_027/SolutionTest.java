package daily_practice.may_2023.day10.offer_ii_027;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        Solution.ListNode node1 = new Solution.ListNode(1);
        Solution.ListNode node2 = new Solution.ListNode(2);
        Solution.ListNode node3 = new Solution.ListNode(2);
        Solution.ListNode node4 = new Solution.ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Solution solution = new Solution();
        boolean ans = solution.isPalindrome(node1);
        System.out.println(ans);
    }
}