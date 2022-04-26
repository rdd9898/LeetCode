package com.hy.day4;

//539.最小时间差

//给定一个 24 小时制（小时:分钟 "HH:MM"）的时间列表，找出列表中任意两个时间的最小时间差并以分钟数表示。

import java.util.List;

//暴力法

public class Solution {
    public static int findMinDifference(List<String> timePoints) {
        int total = 24*60;
        int answer = Integer.MAX_VALUE;
        if (timePoints.size() > 1440) {
            return 0;
        }
        for (int i = 0; i < timePoints.size(); i++) {
            String[] strings = timePoints.get(i).split(":");
            int number1 = Integer.parseInt(strings[0]) * 60 + Integer.parseInt(strings[1]);
            for (int j = i + 1; j < timePoints.size(); j++) {
                String[] strings1 = timePoints.get(j).split(":");
                int number2 = Integer.parseInt(strings1[0]) * 60 + Integer.parseInt(strings1[1]);
                int number = number1 - number2 > 0 ? (number1 - number2) : (number2 - number1);
                number = number > (total - number) ? (total - number) : number;

                if (answer > number) {
                    answer = number;
                }
            }
        }
        return answer;
    }
}
