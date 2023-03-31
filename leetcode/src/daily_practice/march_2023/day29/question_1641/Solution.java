package daily_practice.march_2023.day29.question_1641;

/**
 * @program: LeetCode
 * @description: 1641.统计字典序元音字符串的数目
 * @author: Mr.Hu
 * @create: 2023-03-29 20:39
 **/
public class Solution {

    int ans = 0;
    char[] chars = {'a', 'e', 'i', 'o', 'u'};

    public int countVowelStrings(int n) {
        dfs(0, n);
        return ans;
    }

    private void dfs(int index, int n) {
        if (n == 0) {
            ans++;
            return;
        }
        for (int x = index; x < 5; x++){
            dfs(x, n - 1);
        }
    }

}
