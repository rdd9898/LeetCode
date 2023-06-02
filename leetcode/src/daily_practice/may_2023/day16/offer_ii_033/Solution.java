package daily_practice.may_2023.day16.offer_ii_033;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 033. 变位词组
 * @author: Mr.Hu
 * @create: 2023-05-16 20:11
 **/
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String str : strs) {
            char[] records = new char[26];
            for (char c : str.toCharArray()) {
                records[c - 'a']++;
            }
            String cur = new String(records);
            if (map.containsKey(cur)) {
                res.get(map.get(cur)).add(str);
            } else {
                map.put(cur, res.size());
                List<String> tmp = new ArrayList<>();
                tmp.add(str);
                res.add(tmp);
            }
        }
        return res;
    }

}
