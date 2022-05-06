package daily_practice.undefined_2022.hy2.day52;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 440.字典序的第K数字
 * @date 2022年03月23日 9:50
 */
public class Solution {
    public int findKthNumber(int n, int k) {
        //字典最小值为1
        int curr = 1;
        //最小值找到 步数减一
        k--;
        while (k > 0) {
            int steps = getSteps(curr, n); //找到以curr为前缀的所有值的个数
            //step <= k 说明 第k小值不在以当前curr为前缀的数中
            //step > k 说明 第k小值在以当前curr为前缀的数中 开始寻找以curr*10为前缀的值
            if (steps <= k) {
                k -= steps;
                curr++;
            } else {
                curr = curr * 10;
                k--;
            }
        }
        return curr;
    }

    public int getSteps(int curr, long n) {
        int steps = 0;
        long first = curr;
        long last = curr;
        // 第一次循环step+1，表示curr本身也算一次，然后开始下一层循环，curr对应10个数，10个数每个数也对应10个数，找到符合条件的curr的所有数
        while (first <= n) {
            steps += Math.min(last, n) - first + 1;
            first = first * 10;
            last = last * 10 + 9;
        }
        return steps;
    }
}
