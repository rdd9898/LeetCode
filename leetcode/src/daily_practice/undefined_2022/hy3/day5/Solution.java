package daily_practice.undefined_2022.hy3.day5;

//219.存在重复元素二

//给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。

import java.util.*;

public class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        Map<Integer, Integer> sortedMap = sortMapByValue(map);
        int pre = Integer.MAX_VALUE;
        int preIndex = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry: sortedMap.entrySet()) {
            if (pre == entry.getValue()) {
                if (Math.abs(preIndex - entry.getKey()) <= k) {
                    return true;
                }
            }
            pre = entry.getValue();
            preIndex = entry.getKey();
        }

        return false;
    }

    public static Map<Integer, Integer> sortMapByValue(Map<Integer, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        Iterator<Map.Entry<Integer, Integer>> iterator = entryList.iterator();
        Map.Entry<Integer, Integer> tmpEntry = null;
        while (iterator.hasNext()) {
            tmpEntry = iterator.next();
            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
        }
        return sortedMap;
    }



}
