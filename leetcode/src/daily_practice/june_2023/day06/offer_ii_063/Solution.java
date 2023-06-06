package daily_practice.june_2023.day06.offer_ii_063;

import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 063. 替换单词
 * @author: Mr.Hu
 * @create: 2023-06-06 16:21
 **/
public class Solution {

    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie();
        for (String root : dictionary) {
            trie.insert(root);
        }
        String[] strings = sentence.split(" ");
        for (int i = 0; i < strings.length; i++) {
            String s = trie.startsWith(strings[i]);
            if (s.length() != 0) {
                strings[i] = s;
            }
        }
        StringBuffer res = new StringBuffer();
        for (String string : strings) {
            res.append(string).append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}

class Trie {

    Trie[] children;
    boolean isEnd;

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }

    public void insert(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.children[index] == null) {
                Trie cur = new Trie();
                node.children[index] = cur;
            }
            node = node.children[index];
            if (node.isEnd) return;
        }
        node.isEnd = true;
    }

    public String startsWith(String prefix) {
        Trie node = this;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (node.children[index] == null) {
                return "";
            } else if (node.children[index].isEnd) {
                return stringBuffer.append((char)('a' + index)).toString();
            }
            stringBuffer.append((char)('a' + index));
            node = node.children[index];
        }
        return stringBuffer.toString();
    }
}
