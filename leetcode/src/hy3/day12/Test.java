package com.hy.day12;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/4 11:09
 * @description：
 * @modified By：
 * @version: $
 */
public class Test {
    public static void main(String[] args) {
        int[][] rectangles = {{5,8},{3,9},{5,12},{16,5}};
        int answer = Solution.countGoodRectangles(rectangles);
        System.out.println(answer);
    }
}
