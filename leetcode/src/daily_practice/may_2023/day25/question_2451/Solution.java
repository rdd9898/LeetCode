package daily_practice.may_2023.day25.question_2451;

/**
 * @program: LeetCode
 * @description: 2451. 差值数组不同的字符串
 * @author: Mr.Hu
 * @create: 2023-05-25 21:18
 **/
public class Solution {

    public String oddString(String[] words) {
        int[] tmp1 = new int[words[0].length() - 1];
        int[] tmp2 = new int[words[0].length() - 1];
        for (int i = 0; i < words[0].length() - 1; i++) {
            tmp1[i] = words[0].charAt(i + 1) - words[0].charAt(i);
        }
        for (int i = 0; i < words[0].length() - 1; i++) {
            tmp2[i] = words[1].charAt(i + 1) - words[1].charAt(i);
        }
        boolean flag = true;
        for (int i = 0; i < words[0].length() - 1; i++) {
            if (tmp1[i] != tmp2[i]) flag = false;
        }
        String ans = null;
        if (flag) {
            for (int i = 2; i < words.length; i++) {
                for (int j = 0; j < words[0].length() - 1; j++) {
                    if (words[i].charAt(j + 1) - words[i].charAt(j) != tmp1[j]) {
                        ans = words[i];
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < words[0].length() - 1; i++) {
                if (words[2].charAt(i + 1) - words[2].charAt(i) != tmp1[i]) {
                    ans = words[0];
                    break;
                }
                if (words[2].charAt(i + 1) - words[2].charAt(i) != tmp2[i]) {
                    ans = words[1];
                    break;
                }
            }
        }
        return ans;
    }
}
