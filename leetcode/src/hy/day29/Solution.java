package hy.day29;

//1629.按键持续时间最长的键

//LeetCode 设计了一款新式键盘，正在测试其可用性。测试人员将会点击一系列键（总计 n 个），每次一个。
//
//给你一个长度为 n 的字符串 keysPressed ，其中 keysPressed[i] 表示测试序列中第 i 个被按下的键。releaseTimes 是一个升序排列的列表，其中 releaseTimes[i] 表示松开第 i 个键的时间。字符串和数组的 下标都从 0 开始 。第 0 个键在时间为 0 时被按下，接下来每个键都 恰好 在前一个键松开时被按下。
//
//测试人员想要找出按键 持续时间最长 的键。第 i 次按键的持续时间为 releaseTimes[i] - releaseTimes[i - 1] ，第 0 次按键的持续时间为 releaseTimes[0] 。
//
//注意，测试期间，同一个键可以在不同时刻被多次按下，而每次的持续时间都可能不同。
//
//请返回按键 持续时间最长 的键，如果有多个这样的键，则返回 按字母顺序排列最大 的那个键。

import java.util.*;

public class Solution {
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        int[] listLength = new int[releaseTimes.length];
        for (int i = 0; i < releaseTimes.length; i++) {
            if (i == 0) {
                listLength[i] = releaseTimes[i];
            } else {
                listLength[i] = releaseTimes[i] - releaseTimes[i-1];
            }
        }

        for (int i = 0; i < listLength.length; i++) {
            if (!map.containsKey(String.valueOf(keysPressed.charAt(i)))) {
                map.put(String.valueOf(keysPressed.charAt(i)), 0);
            }
            map.put(String.valueOf(keysPressed.charAt(i)), releaseTimes[i] + map.get(Character.toString(keysPressed.charAt(i))));
        }

        String key = "a";
        Integer value = 0;
        for (Map.Entry<String ,Integer> entry : map.entrySet()) {
             if (value < entry.getValue()) {
                 key = entry.getKey();
                 value = entry.getValue();
             }
             if (value == entry.getValue()) {
                 if (key.compareTo(entry.getKey()) > 0) {
                     key = entry.getKey();
                 }
             }
        }
        return key.charAt(0);

//        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                int flag1 = o2.getValue() - o1.getValue();
//                int flag2 = flag1 == 0 ? o1.getKey().compareTo(o2.getKey()) : flag1;
//                return flag2;
//            }
//        });

    }
}
