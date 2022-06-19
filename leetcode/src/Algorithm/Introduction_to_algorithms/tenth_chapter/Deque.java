package Algorithm.Introduction_to_algorithms.tenth_chapter;

/**
 * @author 胡阳
 * @ClassName Deque
 * @description: 双端队列通过 Queue 实现
 * @date 2022年06月19日 13:30
 */
public class Deque {

    /**
     * @Description: 双端队列空判定
     * @Param: [queue]
     * @return: boolean
     * @Author: HuYang
     * @Date:2022/6/19 11:37
     */
    public boolean queueEmpty (Queue queue) {
        if (queue.head == queue.tail) {
            return true;
        } else return false;
    }

    /**
     * @Description: 队列满判断
     * @Param: [queue]
     * @return: boolean
     * @Author: HuYang
     * @Date:2022/6/19 11:37
     */
    public boolean queueFull (Queue queue) {
        if (queue.head == queue.tail + 1) {
            return true;
        } else return false;
    }

    /**
     * @Description: 在队头插入元素
     * @Param: [queue, x]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/19 13:34
     */
    public void headEnQueue (Queue queue, int x) {
        if (queueFull(queue)) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if (queue.head == 0) {
                queue.head = queue.length - 1;
            } else queue.head--;
            queue.arr[queue.head] = x;
        }
    }

    /**
     * @Description: 在队尾插入元素
     * @Param: [queue, x]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/19 13:36
     */
    public void tailEnQueue (Queue queue, int x) {
        if (queueFull(queue)) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            queue.arr[queue.tail] = x;
            if (queue.tail == queue.length - 1) {
                queue.tail = 0;
            } else queue.tail++;
        }
    }

    /**
     * @Description: 在队头删除元素并返回
     * @Param: [queue]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/19 13:38
     */
    public int headDeQueue (Queue queue) {
        if (queueEmpty(queue)) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            int x = queue.arr[queue.head];
            if (queue.head == queue.length - 1) {
                queue.head = 0;
            } else queue.head++;
            return x;
        }
    }

    /**
     * @Description: 在队尾删除元素并返回
     * @Param: [queue]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/19 13:40
     */
    public int tailDeQueue (Queue queue) {
        if (queueEmpty(queue)) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if (queue.tail == 0) {
                queue.tail = queue.length - 1;
            } else queue.tail--;
            int x = queue.arr[queue.tail];
            return x;
        }
    }

}
