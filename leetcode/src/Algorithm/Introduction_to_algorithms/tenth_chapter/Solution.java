package Algorithm.Introduction_to_algorithms.tenth_chapter;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 练习
 * @date 2022年06月20日 11:24
 */
public class Solution {

    /**
     * @Description: 通过单链表实现栈是否为空判断
     * @Param: [list]
     * @return: boolean
     * @Author: HuYang
     * @Date:2022/6/20 11:29
     */
    public boolean stackEmpty (List list) {
        if (list.head == null) {
            return true;
        } else return false;
    }

    /**
     * @Description: 通过单链表实现栈的压入操作
     * @Param: [list, x]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/20 11:29
     */
    public void push (List list, Node x) {
        x.next = list.head;
        list.head = x;
    }

    /**
     * @Description: 通过单链表实现栈的弹出操作
     * @Param: [list]
     * @return: Algorithm.Introduction_to_algorithms.tenth_chapter.Node
     * @Author: HuYang
     * @Date:2022/6/20 11:30
     */
    public Node pop (List list) {
        if (stackEmpty(list)) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            Node x = list.head;
            list.head = list.head.next;
            return x;
        }
    }

    /**
     * @Description: 通过单链表实现队列判断是否为空
     * @Param: [list]
     * @return: boolean
     * @Author: HuYang
     * @Date:2022/6/20 11:42
     */
    public boolean queueEmpty (List list) {
        if (list.head == null) {
            return true;
        } else return false;
    }

    /**
     * @Description: 通过单链表实现队列的入队
     * @Param: [list, x]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/20 11:42
     */
    public void enQueue (List list, Node x) {
        if (queueEmpty(list)) {
            list.head = x;
        } else {
            list.tail.next = x;
            list.tail = x;
            x.next = null;
        }
    }

    /**
     * @Description: 通过单链表实现队列的出队
     * @Param: [list]
     * @return: Algorithm.Introduction_to_algorithms.tenth_chapter.Node
     * @Author: HuYang
     * @Date:2022/6/20 11:42
     */
    public Node deQueue (List list) {
        if (queueEmpty(list)) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            Node x = list.head;
            if (list.head == list.tail) {
                list.tail = null;
            }
            list.head = list.head.next;
            return x;
        }
    }

}
