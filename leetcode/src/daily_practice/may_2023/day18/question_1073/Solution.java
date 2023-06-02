package daily_practice.may_2023.day18.question_1073;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 1073. 负二进制数相加
 * @author: Mr.Hu
 * @create: 2023-05-18 20:58
 **/
public class Solution {

    public int[] addNegabinary(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int length = Integer.max(arr1.length, arr2.length);
        int one = 0;
        int two = 0;
        for (int i = 0; i < length; i++) {
            int first = 0;
            int second = 0;
            if (arr1.length - i - 1 >= 0) {
                first = arr1[arr1.length - i - 1];
            }
            if (arr2.length - i - 1 >= 0) {
                second = arr2[arr2.length - i - 1];
            }
            if (first + second + one == 0) {
                list.add(0);
                one = two;
                two = 0;
            }
            else if (first + second + one == 1) {
                list.add(1);
                one = two;
                two = 0;
            }
            else if (first + second + one == 2) {
                list.add(0);
                one = two + 1;
                two = 1;
            } else if (first + second + one == 3) {
                list.add(1);
                one = two + 1;
                two = 1;
            } else {
                list.add(0);
                one = two;
                two = 1;
            }
        }
        if (one == 1 && two == 0) {
            list.add(1);
        } else if (one == 0 && two == 1) {
            list.add(0);
            list.add(1);
        } else if (one == 1) {
            list.add(1);
            list.add(1);
        }
        while (list.size() > 1 && list.get(list.size() - 1) == 0) list.remove(list.size() - 1);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(list.size() - i - 1);
        }
        return res;
    }

}
