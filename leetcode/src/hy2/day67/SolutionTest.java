package hy2.day67;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lexicalOrder() {
        int n = 13;
        Solution solution = new Solution();
        List<Integer> ans = solution.lexicalOrder(n);
        ans.forEach(System.out::println);
    }
}