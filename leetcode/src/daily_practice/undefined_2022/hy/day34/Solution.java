package daily_practice.undefined_2022.hy.day34;

//306.累加数

//累加数 是一个字符串，组成它的数字可以形成累加序列。
//
//一个有效的 累加序列 必须 至少 包含 3 个数。除了最开始的两个数以外，字符串中的其他数都等于它之前两个数相加的和。
//
//给你一个只包含数字'0'-'9'的字符串，编写一个算法来判断给定输入是否是 累加数 。如果是，返回 true ；否则，返回 false 。
//
//说明：累加序列里的数 不会 以 0 开头，所以不会出现1, 2, 03 或者1, 02, 3的情况。

public class Solution {
    public static boolean isAdditiveNumber(String num) {
        char[] arr = num.toCharArray();
        boolean flag = false;
        for (int i = 2; i < num.length(); i++) {
            for (int j = 0; j < i - 1; j++) {
                for (int k = j + 1; k < i; k++) {
                    int i1 = Integer.parseInt(num.substring(0, j+1));
                    int i2 = Integer.parseInt(num.substring(j+1, k+1));
                    int i3 = Integer.parseInt(num.substring(k+1, i+1));
                    if (i1 + i2 == i3) {
                        if (num.substring(0, j+1).length() + num.substring(j+1, k+1).length() + num.substring(k+1, i+1).length() == num.length()) {
                            return true;
                        }
                        for (int m = i+1; m < num.length(); m++) {
                            int l = String.valueOf(i2 + i3).length();
                            int i4 = Integer.parseInt(num.substring(m , m + l));
                            if (i2 + i3 != i4) {
                                flag = false;
                                break;
                            } else {
                                flag = true;
                            }
                            i2 = i3;
                            i3 = i4;
                            m += l-1;
                        }
                        if (flag) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
