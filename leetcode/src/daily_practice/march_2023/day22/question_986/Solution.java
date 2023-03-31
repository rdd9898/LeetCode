package daily_practice.march_2023.day22.question_986;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 986.区间列表的交集
 * @author: Mr.Hu
 * @create: 2023-03-22 21:19
 **/
public class Solution {

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();
        int length1 = firstList.length;
        int length2 = secondList.length;
        int i = 0;
        int j = 0;
        while (i < length1 && j <length2) {
            if (firstList[i][1] < secondList[j][0]) i++;
            else if (firstList[i][0] > secondList[j][1]) j++;
            else if (firstList[i][1] < secondList[j][1]) {
                list.add(new int[]{Integer.max(firstList[i][0], secondList[j][0]), Integer.min(firstList[i][1], secondList[j][1])});
                i++;
            } else {
                list.add(new int[]{Integer.max(firstList[i][0], secondList[j][0]), Integer.min(firstList[i][1], secondList[j][1])});
                j++;
            }
        }
        int[][] ans = new int[list.size()][2];
        for (int x = 0; x < list.size(); x++) {
            ans[x][0] = list.get(x)[0];
            ans[x][1] = list.get(x)[1];
        }
        return list.toArray(new int[list.size()][]);
    }

}
