package daily_practice.undefined_2022.hy.day11;

//851.喧闹和富有

/*
有一组 n 个人作为实验对象，从 0 到 n - 1 编号，其中每个人都有不同数目的钱，以及不同程度的安静值（quietness）。为了方便起见，我们将编号为x的人简称为 "person x"。

给你一个数组 richer ，其中 richer[i] = [ai, bi] 表示 person ai比 person bi 更有钱。另给你一个整数数组 quiet ，其中 quiet[i] 是 person i 的安静值。richer 中所给出的数据 逻辑自恰（也就是说，在 person x 比 person y 更有钱的同时，不会出现 person y 比 person x 更有钱的情况 ）。

现在，返回一个整数数组 answer 作为答案，其中 answer[x] = y 的前提是，在所有拥有的钱肯定不少于 person x 的人中，person y 是最安静的人（也就是安静值 quiet[y] 最小的人）。
* */

import java.util.ArrayList;

public class Solution {
    public static int[] loudAndRich(int[][] richer, int[] quiet) {
        ArrayList<Integer> index = new ArrayList<Integer>();
        ArrayList<Integer> index2 = new ArrayList<Integer>();
        for (int i = 0; i < richer.length; i++) {
            index.add(richer[i][0]);
        }
        for (int i = 0; i < richer.length; i++) {
            index2.add(richer[i][1]);
        }
        int[] answers = new int[quiet.length];
        int min;
        //寻找person i对应answer
        for (int i = 0; i < quiet.length; i++) {
            min = -1;
            for (int j = 0; j < quiet.length; j++) {
                if (ifRich(i, j, richer, index, index2)) {
                    if (min == -1 || quiet[j] <= quiet[min]) {
                        min = j;
                    }
                }
            }
            answers[i] = min;
        }
        return answers;
    }

    //查看person2是否比person富有
    public static Boolean ifRich(int person, int person2, int[][] richer, ArrayList<Integer> index, ArrayList<Integer> index2) {
        Boolean flag;
        if (person2 == person) {
            return true;
        }

        if (index.contains(person2) && (index2.indexOf(person) == index.indexOf(person2))) {


                    if (richer[index.indexOf(person2)][1] == person) {
                        return true;
                    }

                    if (richer[index.indexOf(person2)][1] != person) {
                        flag = ifRich(person, richer[index.indexOf(person2)][1], richer, index, index2);
                        if (flag) {
                            return flag;
                        }
                    }



        }

        return false;

    }
}
