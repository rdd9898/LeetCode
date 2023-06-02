package daily_practice.april_2023.day25.question_2418;

/**
 * @program: LeetCode
 * @description: 2418. 按身高排序
 * @author: Mr.Hu
 * @create: 2023-04-25 09:57
 **/
public class Solution {

    public String[] sortPeople(String[] names, int[] heights) {
        quickSort(names, heights, 0, names.length - 1);
        return names;
    }

    private void quickSort(String[] names, int[] heights, int l, int r) {
        if (l >= r) return;
        int i = l, j = r;
        while (i < j) {
            while (i < j && heights[j] <= heights[l]) j--;
            while (i < j && heights[i] >= heights[l]) i++;
            swap(names, heights, i, j);
        }
        swap(names, heights, i, l);
        quickSort(names, heights, l, i - 1);
        quickSort(names, heights, i + 1, r);
    }

    public void swap(String[] names, int[] heights, int x, int y) {
        String name = names[x];
        int height = heights[x];
        names[x] = names[y];
        heights[x] = heights[y];
        names[y] = name;
        heights[y] = height;
    }

}
