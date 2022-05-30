package daily_practice.may_2022.day30.question_706;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName MyHashMap
 * @description: 706.设计哈希映射
 * @date 2022年05月30日 10:00
 */
public class MyHashMap {

    List<List<Integer>> myHashMap;

    public MyHashMap() {
        myHashMap = new ArrayList<>();
    }

    public void put(int key, int value) {
        boolean flag = true;
        for (int i = 0; i < myHashMap.size(); i++) {
            if (myHashMap.get(i).get(0) == key) {
                myHashMap.get(i).remove(1);
                myHashMap.get(i).add(value);
                flag = false;
            }
        }
        if (flag) {
            List<Integer> list = new ArrayList<>();
            list.add(key);
            list.add(value);
            myHashMap.add(list);
        }
    }

    public int get(int key) {
        for (int i = 0; i < myHashMap.size(); i++) {
            if (myHashMap.get(i).get(0) == key) {
                return myHashMap.get(i).get(1);
            }
        }
        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < myHashMap.size(); i++) {
            if (myHashMap.get(i).get(0) == key) {
                myHashMap.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1,1);
        myHashMap.put(2,2);
        myHashMap.get(1);
        myHashMap.get(3);
        myHashMap.put(2,1);
        myHashMap.get(2);
        myHashMap.remove(2);
        myHashMap.get(2);
    }

}
