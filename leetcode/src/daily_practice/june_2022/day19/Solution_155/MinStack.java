package daily_practice.june_2022.day19.Solution_155;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName MinStack
 * @description:
 * @date 2022年06月19日 10:01
 */
public class MinStack {

    List<Integer> list;
    int size;
    int minIndex;

    public MinStack() {
        list = new ArrayList<Integer>();
        minIndex = -1;
        size = 0;
    }

    public void push(int val) {
        size++;
        list.add(val);
        if (minIndex != -1) {
            if (list.get(minIndex) > val) {
                minIndex = size - 1;
            }
        } else minIndex = 0;
    }

    public void pop() {

        if (minIndex == size - 1) {
            int min = 0;
            for (int i = 1; i < size - 1; i++) {
                if (list.get(i) < list.get(min)) {
                    min = i;
                }
            }
            minIndex = min;
        }
        list.remove(size - 1);
        size--;

    }

    public int top() {
        return list.get(size - 1);
    }

    public int getMin() {
        return list.get(minIndex);
    }

}
