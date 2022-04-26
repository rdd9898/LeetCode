package hy.day13;

//1518.换酒问题

//小区便利店正在促销，用 numExchange 个空酒瓶可以兑换一瓶新酒。你购入了 numBottles 瓶酒。
//
//如果喝掉了酒瓶中的酒，那么酒瓶就会变成空的。
//
//请你计算 最多 能喝到多少瓶酒。

//做出来了

public class Solution {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int number = numBottles;

        int i = DiGui(numBottles, numExchange, number);

        return i;
    }

    public static int DiGui(int numBottles, int numExchange, int number) {
        if ((numBottles / numExchange) == ((numBottles / numExchange + number) / numExchange)) {
            return (numBottles / numExchange + number);
        } else {
            return DiGui((numBottles / numExchange + number), numExchange, number);
        }
    }
}
