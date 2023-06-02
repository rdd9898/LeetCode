package daily_practice.april_2023.day19.offer_41;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 41. 数据流中的中位数
 * @author: Mr.Hu
 * @create: 2023-04-19 15:28
 **/
public class MedianFinder {

    /**
    * @Description: 二分法解决
    * @Author: HuYang
    * @Date: 2023/4/19
    */

    List<Integer> list;

    /** initialize your data structure here. */
    public MedianFinder() {
        this.list = new ArrayList<>();
    }

    public void addNum(int num) {
        int left = 0;
        int right = list.size();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) >= num) right = mid;
            if (list.get(mid) < num) left = mid + 1;
        }
        list.add(left, num);
    }

    public double findMedian() {
        if (list.size() % 2 == 1) return list.get(list.size() / 2);
        return (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2.0;
    }

}
