package daily_practice.undefined_2022.hy4.day04;

import java.util.ArrayList;

/**
 * @program: LeetCode
 * @description: 388.文件的最长绝对路径
 * @author: Mr.Hu
 * @create: 2022-04-20 14:21
 **/
public class Solution {
    public int lengthLongestPath(String input) {
        System.out.println(input);
        ArrayList<ArrayList<String>> dirs = new ArrayList<>();

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(chars[i]);
        }
        return 0;
    }
}
