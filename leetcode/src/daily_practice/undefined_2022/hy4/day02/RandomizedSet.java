package daily_practice.undefined_2022.hy4.day02;

import java.util.*;

/**
 * @program: LeetCode
 * @description: O(1)时间插入、删除和获取随机元素
 * @author: Mr.Like
 * @create: 2022-04-13 13:18
 **/
public class RandomizedSet {

    Map<Integer, Integer> map;
    Random random;
    List<Integer> list;

    public RandomizedSet() {
        map = new HashMap<>();
        random = new Random();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        int index = map.size();
        map.put(val, index);
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        int last = list.get(list.size() - 1);
        list.set(index, last);
        map.put(last, index);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;

    }

    public int getRandom() {
        int index = random.nextInt(list.size());
        Integer integer = list.get(index);
        return integer;
    }

}
