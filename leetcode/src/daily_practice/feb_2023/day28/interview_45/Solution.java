package daily_practice.feb_2023.day28.interview_45;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 面试题45.把数组排成最小的数
 * @author: Mr.Hu
 * @create: 2023-02-28 20:58
 **/
public class Solution {

    /*
    * 若拼接字符串 x+y>y+x，则 x 大于 y
    * 反之，若 x+y<y+x，则 x 小于 y
    * */

    public String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            list.add(String.valueOf(num));
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int length1 = o1.length();
                int length2 = o2.length();
                int max_length = Math.max(length1, length2);
                int min_length = Math.min(length1, length2);
                for (int i = 0; i < min_length; i++) {
                    if (o1.charAt(i) < o2.charAt(i)) return -1;
                    else if (o1.charAt(i) > o2.charAt(i)) return 1;
                }
                int temp = max_length - min_length;
                if (temp == 0) return 0;
                int min = Math.min(temp, min_length);
                if (length1 > length2) {
                    Integer integer1 = Integer.valueOf(o1.substring(min_length, min_length + min));
                    Integer integer2 = Integer.valueOf(o2.substring(0, min));
                    return integer1 - integer2 != 0 ? integer1 - integer2 : o1.charAt(min_length + min - 1) - o2.charAt(min);
                } else {
                    Integer integer1 = Integer.valueOf(o1.substring(0, min));
                    Integer integer2 = Integer.valueOf(o2.substring(min_length, min_length + min));
                    return integer1 - integer2 != 0 ? integer1 - integer2 : o1.charAt(min) - o2.charAt(min_length + min - 1);
                }
            }
        });
        StringBuffer ans = new StringBuffer();
        for (String s : list) {
            ans.append(s);
        }
        return ans.toString();
    }

}
