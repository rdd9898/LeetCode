package daily_practice.april_2023.day11.offer_06;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 06. 从尾到头打印链表
 * @author: Mr.Hu
 * @create: 2023-04-11 16:49
 **/
public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        Deque<Integer> deque = new ArrayDeque<>();
        int num = 0;
        while (head != null) {
            num++;
            deque.push(head.val);
            head = head.next;
        }
        int[] ans = new int[num];
        for (int i = 0; i < num; i++) {
            ans[i] = deque.pop();
        }
        return ans;
    }

}
