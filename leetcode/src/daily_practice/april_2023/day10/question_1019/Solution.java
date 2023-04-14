package daily_practice.april_2023.day10.question_1019;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 1019.链表中的下一个更大节点
 * @author: Mr.Hu
 * @create: 2023-04-10 22:00
 **/
public class Solution {
    public class ListNode {
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

    public int[] nextLargerNodes(ListNode head) {
        List<Integer> ans = new ArrayList<>();
        Deque<int[]> stack = new ArrayDeque<>();

        ListNode cur = head;
        int index = -1;
        while (cur != null) {
            index++;
            ans.add(0);
            while (!stack.isEmpty() && stack.peek()[0] < cur.val) {
                ans.set(stack.pop()[1], cur.val);
            }
            stack.push(new int[]{cur.val, index});
            cur = cur.next;
        }

        int[] arr = new int[ans.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }

}
