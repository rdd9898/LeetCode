package daily_practice.undefined_2022.hy3.day2;

import java.util.Random;

//方法二：水塘抽样
//方法一需要花费 O(n)O(n) 的空间存储链表中的所有元素，那么能否做到 O(1)O(1) 的空间复杂度呢？
//
//我们可以设计如下算法：
//
//从链表头开始，遍历整个链表，对遍历到的第 ii 个节点，随机选择区间 [0,i)[0,i) 内的一个整数，如果其等于 00，则将答案置为该节点值，否则答案不变。
//
//该算法会保证每个节点的值成为最后被返回的值的概率均为 1/n


public class SolutionTwo {
    ListNode head;
    Random random;

    public SolutionTwo(ListNode head) {
        this.head = head;
        random = new Random();
    }

    public int getRandom() {
        int i = 1, ans = 0;
        for (ListNode node = head; node != null; node = node.next) {
            if (random.nextInt(i) == 0) { // 1/i 的概率选中（替换为答案）
                ans = node.val;
            }
            ++i;
        }
        return ans;
    }


}
