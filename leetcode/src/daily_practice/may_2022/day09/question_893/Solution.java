package daily_practice.may_2022.day09.question_893;

import java.util.*;

/**
 * 使用 List 集合解决
 * @author 胡阳
 * @ClassName Solution
 * @description: 893.特殊等价字符串组
 * @date 2022年05月09日 9:56
 */
public class Solution {

    private static int n = 26;

    public int numSpecialEquivGroups(String[] words) {
        int ans = 0;
        int sLength = words[0].length();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int[] sNumbers = new int[n * 2];
            for (int j = 0; j < sLength; j++) {
                int index = words[i].charAt(j) - 'a';
                if (j % 2 == 0) {
                    sNumbers[index]++;
                } else {
                    sNumbers[index + 26]++;
                }
            }
            boolean flag = false;
            for (int[] ints : list) {
                if (Arrays.equals(ints, sNumbers)) {
                    flag = true;
                }
            }
            if (!flag) {
                list.add(sNumbers);
                ans++;
            }
        }
        return ans;
    }

}
