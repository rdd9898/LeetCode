package daily_practice.june_2022.day04.question_929;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: LeetCode
 * @description: 929.独特的电子邮件地址
 * @author: Mr.Hu
 * @create: 2022-06-04 10:57
 **/
public class Solution {

    public int numUniqueEmails(String[] emails) {
        int ans = 0;
        Set<String> set = new HashSet<>();
        for (String email: emails) {
            char[] chars = email.toCharArray();
            StringBuffer sb = new StringBuffer();
            boolean flag = true;
            boolean endFlag = false;
            for (char c: chars) {
                if (flag && c != '.' && c != '@') {
                    if (c == '+') flag = false;
                    else sb.append(c);
                }
                if (c == '@') {
                    endFlag = true;
                    flag = false;
                }
                if (endFlag) {
                    sb.append(c);
                }
            }
            set.add(sb.toString());
        }
        return set.size();
    }

}
