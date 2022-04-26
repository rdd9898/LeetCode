package hy2.day63;

import hy.day43.Node;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 429.N叉树的层序遍历
 * @date 2022年04月08日 9:38
 */
public class Solution {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        BFSSearch(root, lists);
        return lists;
    }

    private void BFSSearch(Node root, List<List<Integer>> lists) {
        Deque<Node> deque = new LinkedList<>();
        deque.offerFirst(root);
        List<Integer> list = new ArrayList<>();
        int number = 1;
        int tmp = 0;
        while (deque.size() != 0) {
            number--;
            Node cur = deque.pollFirst();
            list.add(cur.val);
            List<Node> children = cur.children;
            for (Node child : children) {
                deque.offerLast(child);
                tmp++;
            }
            if (number == 0) {
                lists.add(list);
                list = new ArrayList<Integer>();
                number = tmp;
                tmp = 0;
            }
        }
    }

}
