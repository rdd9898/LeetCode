package daily_practice.undefined_2022.hy.day47;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 720.词典中最长的单词
 * @date 2022年03月17日 9:30
 */
public class Solution {
    public static String longestWord(String[] words) {
        Trie root = new Trie();
        for (String word: words) {
            root.insert(word);
        }
        //若无答案，则返回空字符串。
        String longest = "";
        for (String word: words) {
            if (root.search(word)) {
                // 若其中有多个可行的答案，则返回答案中字典序最小的单词
                if (longest.length() < word.length() || (word.length() == longest.length() && word.compareTo(longest) < 0)) {
                    longest = word;
                }
            }
        }
        return longest;
    }
}
class Trie {
    Trie[] children;
    boolean isEnd;

    public Trie() {
        this.children = new Trie[26];
        this.isEnd = false;
    }

    public void insert(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            //若该结点不为空，该结点的isEnd都应为true
            if (node.children[index] == null || !node.children[index].isEnd) {
                return false;
            }
            node = node.children[index];
        }
        //该结点不为空且该结点的isEnd为true
        return node != null && node.isEnd;
    }
}
