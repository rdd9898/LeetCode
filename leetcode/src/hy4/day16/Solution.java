package hy4.day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 937.重新排列日志文件
 * @date 2022年05月03日 9:24
 */
public class Solution {

    public String[] reorderLogFiles(String[] logs) {

        String[] answers = new String[logs.length];

        List<String> digs = new ArrayList<>();
        List<String> lets = new ArrayList<>();
        for (int i = 0; i < logs.length; i++) {
            String[] split = logs[i].split(" ");
            if (split[1].charAt(0) >= '0' && split[1].charAt(0) <= '9') {
                digs.add(logs[i]);
            } else {
                lets.add(logs[i]);
            }
        }
        Collections.sort(lets, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] s1 = o1.split(" ");
                String[] s2 = o2.split(" ");
                for (int i = 1; i < (s1.length > s2.length ? s2.length: s1.length); i++) {
                    if (s1[i].compareTo(s2[i]) > 0) {
                        return 1;
                    } else if (s1[i].compareTo(s2[i]) < 0) {
                        return -1;
                    }
                }
                if (s1.length > s2.length) {
                    return 1;
                } else if (s1.length < s2.length) {
                    return -1;
                }

                if (s1[0].compareTo(s2[0]) > 0) {
                    return 1;
                } else if (s1[0].compareTo(s2[0]) < 0){
                    return -1;
                }
                return 0;
            }
        });
        int tmp = lets.size();
        for (int i = 0; i < logs.length; i++) {
            if (i < tmp) {
                answers[i] = lets.get(i);
            } else {
                answers[i] = digs.get(i - tmp);
            }
        }
        return answers;
    }

}
