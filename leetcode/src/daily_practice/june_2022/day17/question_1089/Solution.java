package daily_practice.june_2022.day17.question_1089;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1089.复写零
 * @date 2022年06月17日 9:11
 */
public class Solution {

    public void duplicateZeros(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length && j < arr.length; i++, j++) {
            if (arr[i] == 0) {
                newArr[j] = 0;
                j++;
                if (j == arr.length) break;
            }
            newArr[j] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }
    }

}
