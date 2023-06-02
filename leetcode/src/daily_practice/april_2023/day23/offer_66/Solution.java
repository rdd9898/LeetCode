package daily_practice.april_2023.day23.offer_66;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 66. 构建乘积数组
 * @author: Mr.Hu
 * @create: 2023-04-23 17:13
 **/
public class Solution {

    public int[] constructArr(int[] a) {
        int[] b = new int[a.length];
        if (a.length == 0) return b;
        int product = a[0];
        b[0] = 1;
        for (int i = 1; i < a.length; i++) {
            b[i] = product;
            product *= a[i];
        }
        product = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            b[i] *= product;
            product *= a[i];
        }
        return b;
    }

}
