package daily_practice.undefined_2022.hy.day30;

//思路与算法
//
//如果我们有一个二进制数序列，我们也可以将它直接转换成格雷码序列。假设 nn 位二进制数为 bb，对应的格雷码为 gg，转换规则如下：
//
//g(i) = b(i+1) \oplus b(i),~~~~0 \le i \lt n
//g(i)=b(i+1)⊕b(i),    0≤i<n
//
//其中 \oplus⊕ 是按位异或运算，g(i)g(i) 和 b(i)b(i) 分别表示 gg 和 bb 的第 ii 位，且 b(n)=0b(n)=0。
//
//上述转换规则的证明如下：
//
//考虑 nn 位二进制数 b_ib
//i
//​
//  和对应的转换码 g_ig
//i
//​
// ，并且 b_{i+1} = b_i + 1b
//i+1
//​
// =b
//i
//​
// +1 也是 nn 位二进制数。b_{i+1}b
//i+1
//​
//  与 b_ib
//i
//​
//  的区别在于 b_{i+1}b
//i+1
//​
//  将 b_ib
//i
//​
//  二进制下末位连接的 11 全部变成 00，然后将最低位的 00 变成 11。假设变化涉及到的二进制位数为 kk 位，则按照上述转换规则， g_{i+1}g
//i+1
//​
//  与 g_ig
//i
//​
//  只有在第 k - 1k−1 位不相同，其他位都相同。因此转换得到的码相邻的数只有一位不同，而转换码第一个整数和最后一个整数分别由二进制数 0 和 2^n-1 转换而来，也只有一位不同。因为二进制数的取值范围为 [0,~2^n) ，且上述转换规则为一对一映射，因此得到的转换码也是互不相同的，且取值范围也在 [0,~2^n] ，得证。


import java.util.ArrayList;
import java.util.List;

public class NormalSolution {
    public List<Integer> grayCode(int n) {
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < 1 << n; i++) {
            ret.add((i >> 1) ^ i);
        }
        return ret;
    }
}
