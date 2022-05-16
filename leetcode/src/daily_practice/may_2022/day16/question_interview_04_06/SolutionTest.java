package daily_practice.may_2022.day16.question_interview_04_06;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void inorderSuccessor() {

        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        Solution solution = new Solution();
        TreeNode ans = solution.inorderSuccessor(root, left);
        System.out.println(ans.val);

    }
}