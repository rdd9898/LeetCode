package daily_practice.undefined_2022.hy2.day68;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年04月19日 9:57
 */
public class Solution {

    public int[] shortestToChar(String s, char c) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] answers = new int[s.length()];
        Arrays.fill(answers, -1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                deque.addLast(i);
                answers[i] = 0;
            }
        }
        int[] dirs = new int[]{-1, 1};
        while (!deque.isEmpty()) {
            int index = deque.pollFirst();
            for (int dir: dirs) {
                int tmp = index + dir;
                if (tmp >= 0 && tmp < s.length() && answers[tmp] == -1) {
                    deque.addLast(tmp);
                    answers[tmp] = answers[index] + 1;
                }
            }
        }
        return answers;
    }

}
