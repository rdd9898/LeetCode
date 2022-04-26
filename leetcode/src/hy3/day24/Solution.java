package com.hy.day24;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/20 5:51
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static boolean isOneBitCharacter(int[] bits) {
        for (int i = 0; i < bits.length; i++) {
            if (bits[i] == 1) {
                i++;
            }
            if (i >= bits.length) {
                return false;
            }
        }
        return true;
    }
}
