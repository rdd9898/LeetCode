package daily_practice.may_2022.day26.question_1898;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1898.可移除字符的最大数目
 * @date 2022年05月27日 10:20
 */
public class Solution {

    public int maximumRemovals(String s, String p, int[] removable) {
        int left = 0;
        int right = removable.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            boolean flag = isSubsequence(s, p, removable, mid);
            if (flag) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
    private boolean isSubsequence(String s, String p, int[] removable, int k) {
        boolean[] state = new boolean[s.length()];

        for(int i = 0; i <= k; i++) {
            state[removable[i]] = true;
        }
        int j = 0;
        for(int i = 0; i < s.length() && j < p.length(); i++) {
            if (s.charAt(i) == p.charAt(j) && !state[i]) {
                j++;
            }
        }
        return j == p.length();
    }

}
