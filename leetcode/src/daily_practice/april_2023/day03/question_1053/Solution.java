package daily_practice.april_2023.day03.question_1053;

/**
 * @program: LeetCode
 * @description: 1053.交换一次的先前排列
 * @author: Mr.Hu
 * @create: 2023-04-03 19:47
 **/
public class Solution {

    public int[] prevPermOpt1(int[] arr) {
        int length = arr.length;
        for (int i = length - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                for (int j = length - 1; j > i; j--) {
                    if (arr[j] < arr[i] && arr[j] != arr[j - 1]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
                break;
            }
        }
        return arr;
    }

}
