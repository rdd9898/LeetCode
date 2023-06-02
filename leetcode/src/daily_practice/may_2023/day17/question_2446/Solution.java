package daily_practice.may_2023.day17.question_2446;

/**
 * @program: LeetCode
 * @description: 2446. 判断两个事件是否存在冲突
 * @author: Mr.Hu
 * @create: 2023-05-17 10:09
 **/
public class Solution {

    public boolean haveConflict(String[] event1, String[] event2) {
        return !(event1[1].compareTo(event2[0]) < 0 || event2[1].compareTo(event1[0]) < 0);
    }

}
