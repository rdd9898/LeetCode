package daily_practice.march_2023.day02.question_414;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 414.第三大的数
 * @author: Mr.Hu
 * @create: 2023-03-02 20:28
 **/
public class Solution {

    public int thirdMax(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        Iterator<Integer> iterator = hashSet.iterator();
        List<Integer> list = new ArrayList<>();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        Collections.sort(list);
        if (list.size() < 3) return list.get(list.size() - 1);
        else return list.get(list.size() -3);
    }

}
