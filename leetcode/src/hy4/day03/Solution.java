package hy4.day03;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 819.最常见的单词
 * @author: Mr.Like
 * @create: 2022-04-17 14:34
 **/
public class Solution {

    public String mostCommonWord(String paragraph, String[] banned) {
        if (paragraph.split(" ").length == 1) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < paragraph.length(); i++) {
                if ((paragraph.charAt(i) >= 'a' && paragraph.charAt(i) <= 'z') || (paragraph.charAt(i) >= 'A' && paragraph.charAt(i) <= 'Z')) {
                    sb.append(paragraph.charAt(i));
                }
            }
            return sb.toString().toLowerCase();
        }

        Map<String, Integer> map = new HashMap<>();
        List<String> list = Arrays.asList(banned);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < paragraph.length(); i++) {
            if ((paragraph.charAt(i) >= 'a' && paragraph.charAt(i) <= 'z') || (paragraph.charAt(i) >= 'A' && paragraph.charAt(i) <= 'Z')) {
                sb.append(paragraph.charAt(i));
            } else {
                if (sb.toString().length() > 0) {
                    map.put(sb.toString().toLowerCase(), map.getOrDefault(sb.toString().toLowerCase(), 0) + 1);
                }
                sb = new StringBuffer();
            }
        }
        int max = Integer.MIN_VALUE;
        String ans = null;
        for (Map.Entry<String, Integer> entry:map.entrySet()) {

            if (entry.getValue() > max && !list.contains(entry.getKey())) {
                ans = entry.getKey();
                max = entry.getValue();
            }
        }
        return ans;
    }

}
