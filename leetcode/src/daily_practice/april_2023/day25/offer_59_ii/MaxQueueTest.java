package daily_practice.april_2023.day25.offer_59_ii;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxQueueTest {

    @Test
    public void max_value() {
        MaxQueue queue = new MaxQueue();
        System.out.println(queue.max_value());
        System.out.println(queue.pop_front());
        System.out.println(queue.max_value());
        queue.push_back(46);
        System.out.println(queue.max_value());
        System.out.println(queue.pop_front());
        System.out.println(queue.max_value());
        System.out.println(queue.pop_front());
        queue.push_back(868);
        System.out.println(queue.pop_front());
        System.out.println(queue.pop_front());
        System.out.println(queue.pop_front());
        queue.push_back(525);
        System.out.println(queue.pop_front());
        System.out.println(queue.max_value());
        System.out.println(queue.pop_front());
        System.out.println(queue.max_value());
        queue.push_back(123);
        queue.push_back(646);
        System.out.println(queue.max_value());
        System.out.println(queue.pop_front());

    }

    @Test
    public void push_back() {
    }

    @Test
    public void pop_front() {
    }
}