package hy.day42;

/**
 * @author 胡阳
 * @ClassName Test
 * @description:
 * @date 2022年03月08日 14:39
 */
public class Test {
    public static void main(String[] args) {
        String s = "***|**|*****|**||**|*";
        int[][] queries = {{1,17},{4,5},{14,17},{5,11},{15,16}};
        int[] ans = Solution.platesBetweenCandles(s, queries);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
