package daily_practice.undefined_2022.hy2.day58;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年04月01日 9:40
 */
public class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Arrays.sort(arr);
        int[] tmp = new int[arr.length];
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                tmp[i] = arr[i];
                x = i;
            }
        }
        if (x > 0) {
            for (int i = 0; i <= x; i++) {
                arr[i] = tmp[x - i];
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.getOrDefault(arr[i], 0) > 0) {
                map.put(arr[i], map.get(arr[i]) - 1);
                n++;
                if (map.getOrDefault(arr[i] * 2, 0) > 0) {
                    map.put(arr[i] * 2, map.get(arr[i] * 2) - 1);
                    n++;
                } else {
                    return false;
                }
            }
            if (n == arr.length) {
                break;
            }
        }
        return true;
    }
}
