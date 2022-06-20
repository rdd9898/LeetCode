package Algorithm.Introduction_to_algorithms.tenth_chapter;

/**
 * @author 胡阳
 * @ClassName List
 * @description: 链表实现
 * @date 2022年06月20日 10:23
 */
public class List {

    Node head;
    Node tail;

    public List(Node head) {
        this.head = head;
        while (head.next != null) {
            head = head.next;
        }
        this.tail = head;
    }

    /**
     * @Description: 链表搜索 val 为 k 的节点
     * @Param: [list, k]
     * @return: Algorithm.Introduction_to_algorithms.tenth_chapter.Node
     * @Author: HuYang
     * @Date:2022/6/20 10:27
     */
    public Node listSearch (List list, int k) {
        Node x = list.head;
        while (x != null && x.val != k) {
            x = x.next;
        }
        return x;
    }

    /**
     * @Description: 链表在头部插入节点 x
     * @Param: [list, x]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/20 10:40
     */
    public void listInsert (List list, Node x) {
        x.next = list.head;
        if (list.head != null) {
            list.head.prev = x;
        }
        list.head = x;
        x.prev = null;
    }

    /**
     * @Description: 链表删除指定节点 x
     * @Param: [list, x]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/20 10:48
     */
    public void listDelete (List list, Node x) {
        if (x.prev != null) {
            x.prev.next = x.next;
        } else list.head = x.next;
        if (x.next != null) {
            x.next.prev = x.prev;
        }
    }

}
