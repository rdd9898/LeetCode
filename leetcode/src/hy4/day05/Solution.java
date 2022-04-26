package hy4.day05;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 824.山羊拉丁文
 * @author: Mr.Hu
 * @create: 2022-04-21 13:17
 **/
public class Solution {

    public String toGoatLatin(String sentence) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('e', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('u', 1);
        map.put('A', 1);
        map.put('E', 1);
        map.put('I', 1);
        map.put('O', 1);
        map.put('U', 1);
        String[] strings = sentence.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();
            if (map.containsKey(chars[0])) {
                stringBuffer.append(strings[i]).append("ma");
                for (int j = 0; j <= i; j++) {
                    stringBuffer.append('a');
                }
                if (i != strings.length - 1) {
                    stringBuffer.append(' ');
                }
            } else {
                stringBuffer.append(strings[i].substring(1, strings[i].length())).append(strings[i].charAt(0)).append("ma");
                for (int j = 0; j <= i; j++) {
                    stringBuffer.append('a');
                }
                if (i != strings.length - 1) {
                    stringBuffer.append(' ');
                }
            }
        }

        return stringBuffer.toString();

    }

}
