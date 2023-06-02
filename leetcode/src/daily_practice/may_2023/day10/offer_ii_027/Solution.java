package daily_practice.may_2023.day10.offer_ii_027;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 027. 回文链表
 * @author: Mr.Hu
 * @create: 2023-05-10 16:57
 **/
public class Solution {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        Deque<Integer> deque = new ArrayDeque<>();
        ListNode cur = head;
        int length = 0;
        while (cur != null) {
            length++;
            deque.push(cur.val);
            cur = cur.next;
        }
        cur = head;
        for (int i = 0; i < length / 2; i++) {
            if (cur.val != deque.pop()) return false;
            cur = cur.next;
        }
        return true;
    }

}
