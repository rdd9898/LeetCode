package daily_practice.april_2023.day10.question_384;

import java.util.Random;

/**
 * @program: LeetCode
 * @description: 384.打乱数组
 * @author: Mr.Hu
 * @create: 2023-04-10 22:31
 **/
public class Solution {

    int[] original;
    Random random;
    int size;

    public Solution(int[] nums) {
        this.size = nums.length;
        this.original = new int[nums.length];
        this.random = new Random();
        for (int i = 0; i < nums.length; i++) {
            this.original[i] = nums[i];
        }
    }

    public int[] reset() {
        return this.original;
    }

    public int[] shuffle() {
        int[] temp = new int[this.size];
        boolean[] flag = new boolean[this.size];
        for (int i = 0; i < this.size; i++) {
            int cur = random.nextInt(this.size);
            if (!flag[cur]) {
                temp[i] = this.original[cur];
                flag[cur] = true;
            } else {
                i--;
            }
        }
        return temp;
    }

}
