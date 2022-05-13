package daily_practice.may_2022.day13.question_350;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void intersect() {
        int[] nums1 = {1, 2, 2 ,1};
        int[] nums2 = {2, 2};
        Solution solution = new Solution();
        int[] answers = solution.intersect(nums1, nums2);
        for (int answer : answers) {
            System.out.println(answer);
        }
    }
}