package daily_practice.june_2022.day20.question_715;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author 胡阳
 * @ClassName RangeModule
 * @description: 715.Range 模块
 * @date 2022年06月20日 9:24
 */
public class RangeModule {

    TreeMap<Integer, Integer> intervals;

    public RangeModule() {
        intervals = new TreeMap<Integer, Integer>();
    }

    public void addRange(int left, int right) {
        // higherEntry 找 key 比 left 高的最小键的键值对
        Map.Entry<Integer, Integer> entry = intervals.higherEntry(left);
        // firstEntry 找 key 最小的键值对
        if (entry != intervals.firstEntry()) {
            // lowerEntry 找 key 比 entry.getKey() 低的最大键的键值对
            // lastEntry 找 key 最大的键值对
            Map.Entry<Integer, Integer> start = entry != null ? intervals.lowerEntry(entry.getKey()) : intervals.lastEntry();
            if (start != null && start.getValue() >= right) {
                return;
            }
            if (start != null && start.getValue() >= left) {
                left = start.getKey();
                intervals.remove(start.getKey());
            }
        }
        while (entry != null && entry.getKey() <= right) {
            right = Math.max(right, entry.getValue());
            intervals.remove(entry.getKey());
            entry = intervals.higherEntry(entry.getKey());
        }
        intervals.put(left, right);
    }

    public boolean queryRange(int left, int right) {
        Map.Entry<Integer, Integer> entry = intervals.higherEntry(left);
        if (entry == intervals.firstEntry()) {
            return false;
        }
        entry = entry != null ? intervals.lowerEntry(entry.getKey()) : intervals.lastEntry();
        return entry != null && right <= entry.getValue();
    }

    public void removeRange(int left, int right) {
        Map.Entry<Integer, Integer> entry = intervals.higherEntry(left);
        if (entry != intervals.firstEntry()) {
            Map.Entry<Integer, Integer> start = entry != null ? intervals.lowerEntry(entry.getKey()) : intervals.lastEntry();
            if (start != null && start.getValue() >= right) {
                int ri = start.getValue();
                if (start.getKey() == left) {
                    intervals.remove(start.getKey());
                } else {
                    intervals.put(start.getKey(), left);
                }
                if (right != ri) {
                    intervals.put(right, ri);
                }
                return;
            } else if (start != null && start.getValue() > left) {
                intervals.put(start.getKey(), left);
            }
        }
        while (entry != null && entry.getKey() < right) {
            if (entry.getValue() <= right) {
                intervals.remove(entry.getKey());
                entry = intervals.higherEntry(entry.getKey());
            } else {
                intervals.put(right, entry.getValue());
                intervals.remove(entry.getKey());
                break;
            }
        }
    }

}
