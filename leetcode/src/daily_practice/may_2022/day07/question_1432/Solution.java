package daily_practice.may_2022.day07.question_1432;

/**
 * @program: LeetCode
 * @description: 1432.改变一个整数能得到的最大插值
 * @author: Mr.Hu
 * @create: 2022-05-07 13:24
 **/
public class Solution {

    public int maxDiff(int num) {
        if (num <= 9) {
            return 8;
        }
        int max = 100000000;
        int n = 9;
        boolean flag = true;
        while (true) {
            if (num >= max) {
                break;
            }
            max /= 10;
            n--;
        }
        int first = num / max;
        boolean flagMin = false;
        boolean flagMax = false;
        int maxIndex = n;
        int minIndex = n;
        int maxSuffix = max;
        int minSuffix = max;
        int x=0;
        int y=0;
        boolean flag1 = false;
        boolean flag2 = false;
        for (int i = 1; i <= n; i++) {
            if(first > 1 && !flagMin) {
                x = first;
                minIndex = n - i + 1;
                minSuffix = max;
                flagMin = true;
            }
            if(first < 9 && !flagMax) {
                y = first;
                maxIndex = n - i + 1;
                maxSuffix = max;
                flagMax = true;
            }
            if(flagMax && flagMin) {
                break;
            }
            max /= 10;
            if (max == 0 && flagMax) {
                flag1 = true;
                break;
            }
            if (max == 0 && flagMin) {
                flag2 = true;
                break;
            }
            if (max == 0) {
                return 8 * (int) Math.pow(10, n - 1);
            }
            first =  (num / max) % 10;

        }
        int maxValue = num;
        int minValue = num;
        for (int i = 0; i < maxIndex; i++) {
            if (flag2) {
                maxValue = num;
                break;
            }
            if (num / maxSuffix % 10 == y) {
                int a = 9 - num / maxSuffix % 10;
                maxValue += a * maxSuffix;
            }
            maxSuffix /= 10;
        }
        for (int i = 0; i < minIndex; i++) {
            if (flag1) {
                minValue = num;
                break;
            }
            if (n == minIndex) {
                if (num / minSuffix % 10 == x) {
                    int a = num / minSuffix % 10 - 1;
                    minValue -= a * minSuffix;
                }
            } else {
                if (num / minSuffix % 10 == x) {
                    int a = num / minSuffix % 10 - 0;
                    minValue -= a * minSuffix;
                }
            }
            minSuffix /= 10;
        }
        return maxValue - minValue;
    }

}
