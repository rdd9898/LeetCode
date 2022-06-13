package daily_practice.june_2022.day13.question_160;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 哈希 Set，不要使用 List，运行时间长
 * @author 胡阳
 * @ClassName Solution
 * @description: 160.相交链表
 * @date 2022年06月13日 9:19
 */
public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

}
