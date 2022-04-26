package hy.day15;

//997.找到小镇的法官

//小镇里有 n 个人，按从 1 到 n 的顺序编号。传言称，这些人中有一个暗地里是小镇法官。
//
//如果小镇法官真的存在，那么：
//
//小镇法官不会信任任何人。
//每个人（除了小镇法官）都信任这位小镇法官。
//只有一个人同时满足属性 1 和属性 2 。
//给你一个数组 trust ，其中 trust[i] = [ai, bi] 表示编号为 ai 的人信任编号为 bi 的人。
//
//如果小镇法官存在并且可以确定他的身份，请返回该法官的编号；否则，返回 -1 。

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static int findJudge(int n, int[][] trust) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int answer = -1;
        for (int i = 0; i < trust.length; i++) {
            map.put(trust[i][0], trust[i][1]);
        }
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                list.add(i);
            }
        }
        if (list.size() != 1) {
            return -1;
        } else {
            for (int i = 1; i <= n; i++) {
                if (i != list.get(0)) {

                }
            }
        }
        return answer;
    }
}
