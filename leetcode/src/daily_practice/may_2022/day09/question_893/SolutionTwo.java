package daily_practice.may_2022.day09.question_893;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 使用 Set 集合解决
 * @author 胡阳
 * @ClassName SolutionTwo
 * @description: 893.特殊等价字符串组
 * @date 2022年05月09日 13:04
 */
public class SolutionTwo {

    public int numSpecialEquivGroups(String[] words) {
        Set<String> seen = new HashSet();
        for (String S: words) {
            int[] count = new int[52];
            for (int i = 0; i < S.length(); ++i)
                count[S.charAt(i) - 'a' + 26 * (i % 2)]++;
            seen.add(Arrays.toString(count));
        }
        return seen.size();
    }

}
