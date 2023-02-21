package daily_practice.july_2022;

import java.util.*;

/**
 * @program: LeetCode
 * @description:
 * @author: Mr.Hu
 * @create: 2022-07-27 21:29
 **/
public class Solution {

    public int mostFlowers(int kind, int[] numbers) {
        Arrays.sort(numbers);
        int ans = 0;
        int odd = 0;
        for (int number : numbers) {
            ans += number;
            if (number % 2 == 1) {
                odd++;
            }
        }
        if (odd % 2 == 1) {
            return ans;
        } else return ans - 1;
    }

    public double shortestPath(int n, int k, int[] pointA, int[] pointB, int[][] locations) {
        double[] tempA = new double[n];
        double[] tempB = new double[n];
        List<Integer> list = new ArrayList<>();
        Map<Integer, Double> map = new HashMap<>();
        double ans = 0;
        for (int i = 0; i < n; i++) {
            list.add(i);
            tempA[i] = Math.sqrt(Math.pow(locations[i][0] - pointA[0], 2) + Math.pow(locations[i][1] - pointA[1], 2));
            tempB[i] = Math.sqrt(Math.pow(locations[i][0] - pointB[0], 2) + Math.pow(locations[i][1] - pointB[1], 2));
            map.put(i, Math.abs(tempA[i] - tempB[i]));
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (map.get(o1) - map.get(o2) > 0) {
                    return -1;
                } else if (map.get(o1) - map.get(o2) < 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        for (int i = 0; i < n; i++) {
            if (tempA[list.get(i)] < tempB[list.get(i)] && k > 0) {
                ans += tempA[list.get(i)];
                k--;
            } else {
                ans += tempB[list.get(i)];
            }
        }
        return ans;
    }

}
