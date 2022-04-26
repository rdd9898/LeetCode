package com.hy.day4;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> timePoints = new ArrayList<>();
        timePoints.add("01:01");
        timePoints.add("02:01");
        int answer = Solution.findMinDifference(timePoints);
        System.out.println(answer);
    }
}
