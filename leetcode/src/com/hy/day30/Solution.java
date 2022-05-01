package com.hy.day30;


/**
 * @author ：HuYang
 * @date ：Created in 2022/3/19 12:00
 * @description：606.根据二叉树创建字符串
 * @modified By：
 * @version: $
 */
public class Solution {
    public static String tree2str(com.hy.day30.TreeNode root) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(root.val);
        diGui(root, stringBuffer);
        return stringBuffer.toString();
    }

    private static void diGui(com.hy.day30.TreeNode root, StringBuffer stringBuffer) {
        stringBuffer.append('(');
        stringBuffer.append(root.left.val);
        diGui(root.left, stringBuffer);
        stringBuffer.append(')');

    }
}
