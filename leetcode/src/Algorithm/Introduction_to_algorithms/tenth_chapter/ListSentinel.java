package Algorithm.Introduction_to_algorithms.tenth_chapter;

/**
 * @author 胡阳
 * @ClassName ListSentinel
 * @description: 带哨兵的双向链表实现
 * @date 2022年06月20日 11:02
 */
public class ListSentinel {

    Node nil;

    public ListSentinel() {
        nil = new Node();
    }

    public ListSentinel(Node first) {
        nil = new Node();
        nil.next = first;
        first.prev = nil;
        while (first.next != null) {
            first = first.next;
        }
        nil.prev = first;
        first.next = nil;
    }

    /**
     * @Description: 带哨兵改进版链表搜索
     * @Param: [list, k] 
     * @return: Algorithm.Introduction_to_algorithms.tenth_chapter.Node
     * @Author: HuYang
     * @Date:2022/6/20 11:13
     */
    public Node listSearch (ListSentinel list, int k) {
        Node x = list.nil.next;
        while (x != null && x.val != k) {
            x = x.next;
        }
        return x;
    }

    /**
     * @Description: 带哨兵改进版链表删除指定节点
     * @Param: [list, x]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/20 11:16
     */
    public void listDelete (ListSentinel list, Node x) {
        x.next.prev = x.prev;
        x.prev.next = x.next;
    }

    /**
     * @Description: 带哨兵改进版链表在头部插入指定节点
     * @Param: [list, x]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/20 11:18
     */
    public void listInsert (ListSentinel list, Node x) {
        x.next = list.nil.next;
        list.nil.next.prev = x;
        list.nil.next = x;
        x.prev = list.nil;
    }
}
