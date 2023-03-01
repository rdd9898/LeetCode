package daily_practice.feb_2023.day28.question_2363;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 2363.合并相似的物品
 * @author: Mr.Hu
 * @create: 2023-02-28 16:48
 **/
public class Solution {

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] ints : items1) {
            map.put(ints[0], map.getOrDefault(ints[0], 0) + ints[1]);
        }
        for (int[] ints : items2) {
            map.put(ints[0], map.getOrDefault(ints[0], 0) + ints[1]);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(entry.getKey());
            tmp.add(entry.getValue());
            ans.add(tmp);
        }
        ans.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });
        return ans;
    }
}
    
