package daily_practice.june_2022.day09.question_497;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 497.非重叠矩形中的随机点
 * @date 2022年06月09日 9:10
 */
public class Solution {

    private List<Integer> list;
    private int[][] rects;
    private int size = 0;
    private Random random;

    public Solution(int[][] rects) {
        this.list = new ArrayList<Integer>();
        this.rects = rects;
        this.random = new Random();
        for(int[] rect: rects) {
            int temp = (Math.abs((rect[3] - rect[1])) + 1) * (Math.abs((rect[2] - rect[0])) + 1);
            size += temp;
            list.add(temp);
        }
    }

    public int[] pick() {
        int temp = random.nextInt(size);
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (temp >= list.get(i)) {
                temp -= list.get(i);
            } else {
                index = i;
            }
        }
        int width = Math.abs(rects[index][2] - rects[index][0]) + 1;
        int a = temp / width;
        int b = temp - a * width;
        int x = b + Math.min(rects[index][2], rects[index][0]);
        int y = a + Math.min(rects[index][3], rects[index][1]);
        return new int[]{x, y};
    }

}
