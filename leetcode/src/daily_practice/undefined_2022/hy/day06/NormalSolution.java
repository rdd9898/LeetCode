package daily_practice.undefined_2022.hy.day06;
//根据题意，我们先统计 licensePlate 中每个字母的出现次数（忽略大小写），然后遍历 words 中的每个单词，若 26 个字母在该单词中的出现次数均不小于在 licensePlate 中的出现次数，则该单词是一个补全词。返回最短且最靠前的补全词。

//时间复杂度：O(N+L+M⋅∣Σ∣)，其中 NN 是字符串licensePlate 的长度，LL 是 words 中的所有字符串的长度之和，MM 是 words 数组的长度，∣Σ∣ 为字符集合的大小，本题中有 2626 个英文字母，即∣Σ∣=26。
//
//空间复杂度：O(∣Σ∣)。


public class NormalSolution {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        int[] cnt = new int[26];
        //统计licesePlate中每个字母出现次数
        for (int i = 0; i < licensePlate.length(); ++i) {
            char ch = licensePlate.charAt(i);
            if (Character.isLetter(ch)) {
                ++cnt[Character.toLowerCase(ch) - 'a'];
            }
        }
        int idx = -1;
        //统计在words中每个单词26个字母出现次数
        for (int i = 0; i < words.length; ++i) {
            int[] c = new int[26];
            for (int j = 0; j < words[i].length(); ++j) {
                char ch = words[i].charAt(j);
                ++c[ch - 'a'];
            }
            boolean ok = true;
            //若26个字母在该单词中的出现次数均不小于在licensePlate中的出现次数，则该单词符合要求
            for (int j = 0; j < 26; ++j) {
                if (c[j] < cnt[j]) {
                    ok = false;
                    break;
                }
            }
            //找到符合要求的长度最小的单词
            if (ok && (idx < 0 || words[i].length() < words[idx].length())) {
                idx = i;
            }
        }
        return words[idx];
    }
}
