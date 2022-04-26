package hy.day17;

//方法一：直接计算
//思路与算法
//
//我们首先从给定的字符串 date 中提取出年 year，月 month 以及日 day。
//
//这样一来，我们就可以首先统计到 month 的前一个月为止的天数。这一部分只需要使用一个长度为 12 的数组，预先记录每一个月的天数，再进行累加即可。随后我们将答案再加上 day，就可以得到 date 是一年中的第几天。
//
//需要注意的是，如果 year 是闰年，那么二月份会多出一天。闰年的判定方法为：year 是 400 的倍数，或者 year 是 4 的倍数且不是 100 的倍数。

public class NormalSolution {
    public static int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        int[] amount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            ++amount[1];
        }

        int ans = 0;
        for (int i = 0; i < month - 1; ++i) {
            ans += amount[i];
        }
        return ans + day;
    }
}
