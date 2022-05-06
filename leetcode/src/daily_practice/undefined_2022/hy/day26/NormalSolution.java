package daily_practice.undefined_2022.hy.day26;

//根据欧几里得-欧拉定理，每个偶完全数都可以写成
//
//2^{p-1}(2^p-1)
//的形式，其中 p 为素数且 2^p-12 为素数。
//
//由于目前奇完全数还未被发现，因此题目范围 [1,10^8] 内的完全数都可以写成上述形式。
//
//这一共有如下 55 个：
//
//6, 28, 496, 8128, 33550336

public class NormalSolution {
    public static boolean checkPerfectNumber(int num) {
        return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336;
    }
}
