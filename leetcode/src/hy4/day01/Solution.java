package hy4.day01;

/**
 * @program: LeetCode
 * @description: 796.旋转字符串
 * @author: Mr.Like
 * @create: 2022-04-07 20:57
 **/
public class Solution {

    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }

}
