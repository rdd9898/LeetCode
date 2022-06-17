package Algorithm.Introduction_to_algorithms.ninth_chapter;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: ninth_chapter
 * @date 2022年06月16日 11:11
 */
public class Solution {

    /**
     * @Description: 找到数组中最小的值
     * @Param: [arr]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/16 11:14
     */
    public int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

}
