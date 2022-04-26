package hy.day27;

//390.消除游戏

//列表 arr 由在范围 [1, n] 中的所有整数组成，并按严格递增排序。请你对 arr 应用下述算法：
//  从左到右，删除第一个数字，然后每隔一个数字删除一个，直到到达列表末尾。
//  重复上面的步骤，但这次是从右到左。也就是，删除最右侧的数字，然后剩下的数字每隔一个删除一个。
//  不断重复这两步，从左到右和从右到左交替进行，直到只剩下一个数字。
//给你整数 n ，返回 arr 最后剩下的数字。

public class Solution {
    public static int lastRemaining(int n) {
        // 从左到右一定要消除第一个, 此时剩下的数组里的第一个要加一个step
        // 比如1 2 3 4 ... 9, 从左到右消除后第一个是2, 此时的2由first+step=1+1得来, 此时剩下的数是
        // 2 4 6 8, first=2, step=1*2=2, 此时从右往左消除得到的第一个剩下的数first还是2, step=4,
        // 因为剩下了 2 6. 再从左往右消除一定消除第一个, 此时first=first+step=2+4=6, 剩下的数只有1个, 于是返回
        // first   要注意的是, 对于从右往左奇数长度的时候会消除第一个, 因此要考虑
        int first = 1;
        int step = 1;
        int remain = n;
        boolean isLeft = true;
        while (remain > 1) {
            if (isLeft || ((remain & 1) == 1)) {  // 若从左边开始必删第一个，若从右边开始奇数长度删第一个
                first += step;
            }
            isLeft = !isLeft;
            step <<= 1;  // 左移一位，相当于x2
            remain >>= 1;  // 右移一位，相当于/2
        }
        return first;
    }
}
