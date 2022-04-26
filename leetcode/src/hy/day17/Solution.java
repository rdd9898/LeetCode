package hy.day17;

//1154.一年中的第几天

//给你一个字符串date ，按 YYYY-MM-DD 格式表示一个 现行公元纪年法 日期。请你计算并返回该日期是当年的第几天。
//
//通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。


public class Solution {
    public static int dayOfYear(String date) {
        String[] strings = date.split("-");
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (Integer.parseInt(strings[0]) % 400 == 0 || (Integer.parseInt(strings[0]) % 4 == 0 && Integer.parseInt(strings[0]) % 100 !=0))
            days[1]++;
        int ans = 0;
        for (int i = 0; i < Integer.parseInt(strings[1]) - 1; i++) {
            ans += days[i];
        }
        ans += Integer.parseInt(strings[2]);

        return ans;
    }
}
