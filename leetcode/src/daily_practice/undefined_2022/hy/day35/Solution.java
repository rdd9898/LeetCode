package daily_practice.undefined_2022.hy.day35;

//334.递增的三元子序列

//给你一个整数数组 nums ，判断这个数组中是否存在长度为 3 的递增子序列。
//
//如果存在这样的三元组下标 (i, j, k) 且满足 i < j < k ，使得 nums[i] < nums[j] < nums[k] ，返回 true ；否则，返回 false 。




//可以使用贪心的方法将空间复杂度降到 O(1)O(1)。从左到右遍历数组 \textit{nums}nums，遍历过程中维护两个变量 \textit{first}first 和 \textit{second}second，分别表示递增的三元子序列中的第一个数和第二个数，任何时候都有 \textit{first} < \textit{second}first<second。
//
//初始时，\textit{first} = \textit{nums}[0]first=nums[0]，\textit{second} = +\inftysecond=+∞。对于 1 \le i < n1≤i<n，当遍历到下标 ii 时，令 \textit{num} = \textit{nums}[i]num=nums[i]，进行如下操作：
//
//如果 \textit{num} > \textit{second}num>second，则找到了一个递增的三元子序列，返回 \text{true}true；
//
//否则，如果 \textit{num} > \textit{first}num>first，则将 \textit{second}second 的值更新为 \textit{num}num；
//
//否则，将 \textit{first}first 的值更新为 \textit{num}num。
//
//如果遍历结束时没有找到递增的三元子序列，返回 \text{false}false。
//
//上述做法的贪心思想是：为了找到递增的三元子序列，\textit{first}first 和 \textit{second}second 应该尽可能地小，此时找到递增的三元子序列的可能性更大。
//
//假设 (\textit{first}, \textit{second}, \textit{num})(first,second,num) 是一个递增的三元子序列，如果存在 \textit{second'}second’ 满足 \textit{first} < \textit{second'} < \textit{second}first<second’<second 且 \textit{second'}second’ 的下标位于 \textit{first}first 的下标和 \textit{num}num 的下标之间，则 (\textit{first}, \textit{second'}, \textit{num})(first,second’,num) 也是一个递增的三元子序列。但是当 (\textit{first}, \textit{second'}, \textit{num})(first,second’,num) 是递增的三元子序列时，由于 \textit{num}num 不一定大于 \textit{second}second，因此 (\textit{first}, \textit{second}, \textit{num})(first,second,num) 未必是递增的三元子序列。由此可见，为了使找到递增的三元子序列的可能性更大，三元子序列的第二个数应该尽可能地小，将 \textit{second'}second’ 作为三元子序列的第二个数优于将 \textit{second}second 作为三元子序列的第二个数。
//
//同理可得，三元子序列的第一个数也应该尽可能地小。
//
//如果遍历过程中遇到的所有元素都大于 \textit{first}first，则当遇到 \textit{num} > \textit{second}num>second 时，\textit{first}first 一定出现在 \textit{second}second 的前面，\textit{second}second 一定出现在 \textit{num}num 的前面，(\textit{first}, \textit{second}, \textit{num})(first,second,num) 即为递增的三元子序列。
//
//如果遍历过程中遇到小于 \textit{first}first 的元素，则会用该元素更新 \textit{first}first，虽然更新后的 \textit{first}first 出现在 \textit{second}second 的后面，但是在 \textit{second}second 的前面一定存在一个元素 \textit{first'}first’ 小于 \textit{second}second，因此当遇到 \textit{num} > \textit{second}num>second 时，(\textit{first'}, \textit{second}, \textit{num})(first’,second,num) 即为递增的三元子序列。
//
//根据上述分析可知，当遇到 \textit{num} > \textit{second}num>second 时，一定存在一个递增的三元子序列，该三元子序列的第二个数和第三个数分别是 \textit{second}second 和 \textit{num}num，因此返回 \text{true}true。

public class Solution {
    public static boolean increasingTriplet(int[] nums) {
        int first = nums[0];
        int second = Integer.MAX_VALUE;;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > second) {
                return true;
            }
            if (nums[i] > first) {
                second = nums[i];
            } else {
                first = nums[i];
            }
        }
        return false;
    }
}
