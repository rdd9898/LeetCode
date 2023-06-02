package daily_practice.april_2023.day19.offer_41;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 41. 数据流中的中位数
 * @author: Mr.Hu
 * @create: 2023-04-19 15:55
 **/
public class MedianFinder2 {

    Queue<Integer> A, B;
    public MedianFinder2() {
        A = new PriorityQueue<>(); // 小顶堆，保存较大的一半
        B = new PriorityQueue<>((x, y) -> (y - x)); // 大顶堆，保存较小的一半
    }

    public void addNum(int num) {
        if (A.size() != B.size()) {
            A.add(num);
            B.add(A.poll());
        } else {
            B.add(num);
            A.add(B.poll());
        }
    }

    public double findMedian() {
        return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;
    }

}
