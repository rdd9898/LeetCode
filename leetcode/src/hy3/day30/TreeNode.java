package com.hy.day30;

/**
 * @author ：HuYang
 * @date ：Created in 2022/3/19 12:01
 * @description：
 * @modified By：
 * @version: $
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
