package daily_practice.may_2022.day17.question_953;

import java.util.*;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 953.验证外星语词典
 * @date 2022年05月17日 9:16
 */
public class Solution {

    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }

        List<String> list = new ArrayList<>();
        for (String s: words) {
            list.add(s);
        }

        for (int i = 0; i < 20; i++) {
            int pre = list.get(0).length() >= i + 1 ? map.get(list.get(0).charAt(i)) : -1;
            for (int j = 1; j < list.size(); j++) {
                if ((list.get(j).length() >= i + 1 ? map.get(list.get(j).charAt(i)) : -1) < pre) {
                    return false;
                } else if ((list.get(j).length() >= i + 1 ? map.get(list.get(j).charAt(i)) : -1) > pre) {
                    pre = list.get(j).length() >= i + 1 ? map.get(list.get(j).charAt(i)) : -1;
                    list.remove(j - 1);
                    j--;
                }
            }
            if (list.size() == 1) {
                return true;
            }
        }

        return true;
    }

}
