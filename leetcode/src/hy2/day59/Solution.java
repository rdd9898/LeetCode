package hy2.day59;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 744.寻找比目标字母大的最小字母
 * @date 2022年04月03日 10:56
 */
public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char letter: letters) {
            if (letter - target > 0) {
                return letter;
            }
        }
        return letters[0];
    }
}
