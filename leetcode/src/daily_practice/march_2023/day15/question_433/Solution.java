package daily_practice.march_2023.day15.question_433;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 433.最小基因变化
 * @author: Mr.Hu
 * @create: 2023-03-15 20:25
 **/
public class Solution {

    public int minMutation(String startGene, String endGene, String[] bank) {
        boolean flag = false;
        for (String s : bank) {
            boolean equals = s.equals(endGene);
            if (equals) flag = true;
        }
        boolean[] flags = new boolean[bank.length];
        if (!flag) return -1;
        int ans = 0;
        Deque<String> deque = new ArrayDeque<>();
        deque.offerFirst(startGene);
        int size = 1;
        int tempSize = 0;
        flag = false;
        while (deque.size() != 0) {
            size--;
            String cur = deque.pollFirst();
            if (cur.equals(endGene)) {
                flag = true;
                return ans;
            }
            if (size == 0) ans++;
            for (int i = 0; i < bank.length; i++) {
                String s = bank[i];
                if (compareGene(s, cur) && !flags[i]) {
                    flags[i] = true;
                    tempSize++;
                    deque.offerLast(s);
                }
            }
            if (size == 0) {
                size = tempSize;
                tempSize = 0;
            }
        }
        if (flag) return ans;
        return -1;
    }

    private boolean compareGene(String s1, String s2) {
        int temp = 0;
        int length = s1.length();
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) != s2.charAt(i)) temp++;
            if (temp > 1) return false;
        }
        return true;
    }


}
