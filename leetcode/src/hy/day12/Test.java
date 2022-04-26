package hy.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int angle = 90;
        List<Integer> location = new ArrayList<>();
        location.add(1);
        location.add(1);
        List<List<Integer>> points = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            List<Integer> list= new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            points.add(list);
        }

        int visiblePoints = Solution.visiblePoints(points, angle, location);
        System.out.println(visiblePoints);
    }
}
