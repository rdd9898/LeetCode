package Algorithm.Introduction_to_algorithms.tenth_chapter;

/**
 * @author 胡阳
 * @ClassName Queue
 * @description: 队列的实现
 * @date 2022年06月19日 11:02
 */
public class Queue {

    int[] arr = new int[10];
    int length = 10;
    int tail = 0;
    int head = 0;

    public Queue() {
    }

    /**
     * @Description: 入列
     * @Param: [queue, x]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/19 11:07
     */
    public void enQueue (Queue queue, int x) {
        queue.arr[queue.tail] = x;
        if (queue.tail == queue.length - 1) {
            queue.tail = 0;
        } else queue.tail++;
    }

    /**
     * @Description: 出列
     * @Param: [queue]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/19 11:07
     */
    public int deQueue (Queue queue) {
        int x = queue.arr[queue.head];
        if (queue.head == queue.length - 1) {
            queue.head = 0;
        } else queue.head++;
        return x;
    }

    /**
     * @Description: 队列空判定
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
     * @Description: 带溢出判断的入队
     * @Param: [queue, x]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/19 11:37
     */
    public void enQueueWithFlow (Queue queue, int x) {
        if (queueFull(queue)) {
            System.out.println("上溢出");
            throw new ArrayIndexOutOfBoundsException();
        } else {
            queue.arr[queue.tail] = x;
            if (queue.tail == queue.length - 1) {
                queue.tail = 0;
            } else queue.tail++;
        }
    }

    /**
     * @Description: 带溢出判断的出队
     * @Param: [queue]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/19 11:37
     */
    public int deQueueWithFlow (Queue queue) {
        if (queueEmpty(queue)) {
            System.out.println("下溢出");
            throw new ArrayIndexOutOfBoundsException();
        } else {
            int x = queue.arr[queue.head];
            if (queue.head == queue.length - 1) {
                queue.head = 0;
            } else queue.tail++;
            return x;
        }
    }
}
