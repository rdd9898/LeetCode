package daily_practice.undefined_2022.hy4.day12;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void getAllElements() {

        TreeNode left1 = new TreeNode(1);
        TreeNode right1 = new TreeNode(4);
        TreeNode root1 = new TreeNode(2, left1, right1);

        TreeNode left2 = new TreeNode(0);
        TreeNode right2 = new TreeNode(3);
        TreeNode root2 = new TreeNode(1, left2, right2);

        Solution solution = new Solution();
        List<Integer> answers = solution.getAllElements(root1, root2);
        answers.forEach(System.out::println);

    }
}