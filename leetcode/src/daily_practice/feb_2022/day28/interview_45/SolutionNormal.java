package daily_practice.feb_2022.day28.interview_45;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @program: LeetCode
 * @description:
 * @author: Mr.Hu
 * @create: 2023-02-28 22:14
 **/
public class SolutionNormal {

    public String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            list.add(String.valueOf(num));
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                StringBuffer sb1 = new StringBuffer(o1 + o2);
                StringBuffer sb2 = new StringBuffer(o2 + o1);
                return sb1.toString().compareTo(sb2.toString());
            }
        });
        StringBuffer ans = new StringBuffer();
        for (String s : list) {
            ans.append(s);
        }
        return ans.toString();
    }

}
