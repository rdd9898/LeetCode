package hy.day45;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 599.两个列表的最小索引和
 * @date 2022年03月14日 9:24
 */
public class Solution {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> list = new ArrayList<>();
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (i + j < index) {
                        list.clear();
                        list.add(list1[i]);
                        index = i + j;
                    } else if (i + j == index) {
                        list.add(list1[i]);
                    }
                }
            }
        }
        String[] ans = list.toArray(new String[list.size()]);
        return ans;
    }

}
