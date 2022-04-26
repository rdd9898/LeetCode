package hy.day10;

public class Test {
    public static void main(String[] args) {
        int[][] courses = {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
        int answer = Solution.scheduleCourse(courses);
        System.out.println(answer);
    }
}
