package daily_practice.undefined_2022.hy.day07;

//911.在线选举

//给你两个整数数组 persons 和 times 。在选举中，第 i 张票是在时刻为 times[i] 时投给候选人 persons[i] 的。
//
//对于发生在时刻 t 的每个查询，需要找出在 t 时刻在选举中领先的候选人的编号。
//
//在 t 时刻投出的选票也将被计入我们的查询之中。在平局的情况下，最近获得投票的候选人将会获胜。
//
//实现 TopVotedCandidate 类：
//
//TopVotedCandidate(int[] persons, int[] times) 使用 persons 和 times 数组初始化对象。
//int q(int t) 根据前面描述的规则，返回在时刻 t 在选举中领先的候选人的编号。
//


//方法一：预计算 + 二分查找
//思路及解法
//
//记 persons 的长度为 N。我们对输入进行预计算，用一个长度为 N 的数组 tops 记录各时间段得票领先的候选人。具体来说 tops[i] 表示
//
//的时间段中领先的候选人。这样的预计算可以通过对 persons 在 times 上的计数完成。具体实现方法是，我们用一个哈希表 voteCounts 记录不同候选人的得票数，用一个变量 top 表示当前领先的候选人。按时间从小到大遍历 persons 和 times，并更新 voteCounts 和 top，把 top 放入 tops。遍历结束后，我们可以得到一个长度为 NN 的 tops，表示各个时间段得票领先的候选人。
//
//每次查询时，我们在 times 中找出不大于 tt 且离 tt 最近的元素的下标，这步操作可以通过二分查找完成。到 tops 索引相同的下标即可返回结果。
//


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    List<Integer> tops;
    Map<Integer, Integer> voteCounts;
    int[] times;

    public Solution(int[] persons, int[] times) {
        tops = new ArrayList<Integer>();
        voteCounts = new HashMap<Integer, Integer>();
        voteCounts.put(-1, -1);
        int top = -1;
        for (int i=0; i < persons.length; i++) {
            int p = persons[i];
            voteCounts.put(p, voteCounts.getOrDefault(p, 0) + 1); //getOrDefault找key对应的value值，如果找不到返回设置的默认值
            if (voteCounts.get(p) >=voteCounts.get(top)) { //如果当前人的票数大于等于之前票数最高的人，则该人为当前票数最高的人（同票默认最后被选的人）
                top = p ;
            }
            tops.add(top); //当前时刻票数最高人添加到tops中
        }
        this.times = times;
    }

    public int q(int t) {
        int low = 0, high = times.length - 1;
        //二分查找
        while (low < high) {
            int middle = (low + high) / 2;
            if (times[middle] < t) {
                low = middle;
            } else {
                high = middle - 1;
            }
        }
        return tops.get(low);
    }
}
