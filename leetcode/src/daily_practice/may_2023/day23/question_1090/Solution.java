package daily_practice.may_2023.day23.question_1090;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @program: LeetCode
 * @description: 1090. 受标签影响的最大值
 * @author: Mr.Hu
 * @create: 2023-05-23 20:40
 **/
public class Solution {

    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        quickSort(values, labels, 0, values.length - 1);
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int nums = 0;
        int index = 0;
        while (nums < numWanted && index < values.length) {
            if (map.getOrDefault(labels[index], 0) < useLimit) {
                nums++;
                res += values[index];
                map.put(labels[index], map.getOrDefault(labels[index], 0) + 1);
            }
            index++;
        }
        return res;
    }

    private void quickSort(int[] values, int[] labels, int l, int r) {
        if (l >= r) return;
        int i = l, j = r;
        while (i < j) {
            while (i < j && values[j] <= values[l]) j--;
            while (i < j && values[i] >= values[l]) i++;
            swap(values, labels, i, j);
        }
        swap(values, labels, i, l);
        quickSort(values, labels, l, i);
        quickSort(values, labels, i + 1, r);
    }

    private void swap(int[] values, int[] labels, int x, int y) {
        int tmp = values[x];
        values[x] = values[y];
        values[y] = tmp;
        tmp = labels[x];
        labels[x] = labels[y];
        labels[y] = tmp;
    }
}
