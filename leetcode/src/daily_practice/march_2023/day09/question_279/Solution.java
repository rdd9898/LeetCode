package daily_practice.march_2023.day09.question_279;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 279.完全平方数
 * @author: Mr.Hu
 * @create: 2023-03-09 20:07
 **/
public class Solution {

    public int numSquares(int n) {
        ArrayList<Integer> square_nums = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            square_nums.add(i * i);
        }
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(n);
        int size = 1;
        int tmpsize = 0;
        int level = 0;
        while (deque.size() > 0) {
            size--;
            if (size == 0) level++;
            int cur = deque.pollFirst();
            for (Integer squareNum : square_nums) {
                if (cur == squareNum && size == 0) return level;
                else if (cur == squareNum && size != 0) return level + 1;
                else if (cur < squareNum) break;
                else {
                    deque.offerLast(cur - squareNum);
                    tmpsize++;
                }
            }
            if (size == 0) {
                size = tmpsize;
                tmpsize = 0;
            }
        }
        return level;
    }

}
