package daily_practice.july_2022.day04.question_1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 1200.最小绝对差
 * @author: Mr.Hu
 * @create: 2022-07-03 20:32
 **/
public class Solution {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int pre = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - pre < min) {
                min = arr[i] - pre;
                ans.clear();
                List<Integer> tmp = new ArrayList<>();
                tmp.add(pre);
                tmp.add(arr[i]);
                ans.add(tmp);
            } else if (arr[i] - pre == min) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(pre);
                tmp.add(arr[i]);
                ans.add(tmp);
            }
            pre = arr[i];
        }
        return ans;
    }

}
