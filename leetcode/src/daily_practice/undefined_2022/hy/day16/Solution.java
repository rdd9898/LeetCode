package daily_practice.undefined_2022.hy.day16;

//475.供暖器

//冬季已经来临。你的任务是设计一个有固定加热半径的供暖器向所有房屋供暖。
//
//在加热器的加热半径范围内的每个房屋都可以获得供暖。
//
//现在，给出位于一条水平线上的房屋 houses 和供暖器 heaters 的位置，请你找出并返回可以覆盖所有房屋的最小加热半径。
//
//说明：所有供暖器都遵循你的半径标准，加热的半径也一样。

public class Solution {
    public static int findRadius(int[] houses, int[] heaters) {
        boolean flag = false;
        boolean flag2 = true;
        int answer = 0;
        while (!flag) {
            for (int i = 0; i < houses.length; i++) {
                for (int j = 0; j < heaters.length; j++) {
                    if (houses[i] >= heaters[j] - answer && houses[i] <= heaters[j] + answer) {
                        flag2 = true;
                        break;
                    } else {
                        flag2 = false;
                    }
                }
                if (!flag2) {
                    answer++;
                    break;
                }
            }
            if (flag2)
                flag = true;
        }
        return answer;
    }
}
