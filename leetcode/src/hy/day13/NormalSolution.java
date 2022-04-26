package hy.day13;

//首先我们一定可以喝到 b 瓶酒，剩下 b 个空瓶。接下来我们可以拿瓶子换酒，每次拿出 e 个瓶子换一瓶酒，然后再喝完这瓶酒，得到一个空瓶。以此类推，我们可以统计得到答案。


public class NormalSolution {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int bottle = numBottles, ans = numBottles;
        while (bottle >= numExchange) {
            bottle -= numExchange;
            ++ans;
            ++bottle;
        }
        return ans;
    }
}
