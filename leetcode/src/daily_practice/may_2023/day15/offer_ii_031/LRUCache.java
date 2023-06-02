package daily_practice.may_2023.day15.offer_ii_031;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 031. 最近最少使用缓存
 * @author: Mr.Hu
 * @create: 2023-05-15 22:14
 **/
public class LRUCache {

    int cur;
    Deque<Integer> deque;
    HashMap<Integer, Integer> map;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cur = 0;
        deque = new ArrayDeque<>();
        map = new HashMap<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        deque.remove(key);
        deque.addFirst(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            deque.remove(key);
        } else {
            if (deque.size() == capacity) {
                int last = deque.pollLast();
                map.remove(last);
            }
        }
        deque.addFirst(key);
        map.put(key, value);
    }

}
