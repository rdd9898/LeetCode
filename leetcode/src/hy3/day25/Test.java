package com.hy.day25;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/21 19:14
 * @description：
 * @modified By：
 * @version: $
 */
public class Test {
    public static void main(String[] args) {
        String dominoes = ".L.R...LR..L..";
        String ans = Solution.pushDominoes(dominoes);
        System.out.println(ans);
    }
}
