package Algorithm.Tire.Trie;

/**
 * @author 胡阳
 * @ClassName Trie
 * @description: 字典树
 * @date 2022年03月17日 10:01
 */
public class Trie {
    private Trie[] children; //表示指向子节点的数组
    private boolean isEnd; //表示当前字母是否是某个字符串的结尾
    //初始化前缀树对象。
    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }
    //向前缀树中插入字符串 word 。
    public void insert(String word) {
        Trie node = this; //表示root
        //根据word的长度添加
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            //在指定位置不为空说明存在该字符
            if (node.children[index] == null) {
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }
    //如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回 false 。
    public boolean search(String word) {
        // 获得最后一个结点信息
        Trie node = searchPrefix(word);
        // 如果没有该结点或者该结点的isEnd为false 返回false
        return node != null && node.isEnd;
    }
    //如果之前已经插入的字符串 word 的前缀之一为 prefix，返回 true ，否则，返回 false 。
    public boolean startsWith(String prefix) {
        // 如果没有返回null说明prefix是前缀 返回true
        return searchPrefix(prefix) != null;
    }

    //如果字符串 prefix 在前缀树中，返回 最后一个结点；否则，返回 null 。
    private Trie searchPrefix(String prefix) {
        Trie node = this; //表示root
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            //为空表示该结点不存在字符
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        //返回prefix最后一个字符的结点
        return node;
    }
}
