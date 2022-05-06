package daily_practice.undefined_2022.hy.day43;

import java.util.List;

/**
 * @author 胡阳
 * @ClassName Node
 * @description:
 * @date 2022年03月10日 9:50
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
