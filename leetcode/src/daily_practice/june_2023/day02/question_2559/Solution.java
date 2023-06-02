package daily_practice.june_2023.day02.question_2559;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: LeetCode
 * @description: 2559. 统计范围内的元音字符串数
 * @author: Mr.Hu
 * @create: 2023-06-02 15:49
 **/
public class Solution {

    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] sums = new int[words.length + 1];
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            if (set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(words[i].length() - 1))) {
                sum++;
            }
            sums[i + 1] = sum;
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            res[i] = sums[query[1] + 1] - sums[query[0]];
        }
        return res;
    }
}
