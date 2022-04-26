package hy.day44;

/**
 * @author 胡阳
 * @ClassName Test
 * @description:
 * @date 2022年03月11日 10:32
 */
public class Test {
    public static void main(String[] args) {
        int[] parents = {-1,2,0,2,0};
        int ans = Solution.countHighestScoreNodes(parents);
        System.out.println(ans);
    }
}
