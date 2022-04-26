package hy.day48;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 2043.简易银行系统
 * @date 2022年03月18日 10:13
 */
public class Bank {
    long[] balance;
    public Bank(long[] balance) {
        this.balance = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 >= 1 && account1 <= balance.length && account2 >= 1 && account2 <= balance.length) {
            if (withdraw(account1, money)) {
                deposit(account2, money);
                return true;
            }
        }
        return false;
    }

    public boolean deposit(int account, long money) {
        if (account >= 1 && account <= balance.length) {
            balance[account - 1] += money;
            return true;
        }
        return false;
    }

    public boolean withdraw(int account, long money) {
        if (account >= 1 && account <= balance.length) {
            if (balance[account - 1] >= money) {
                balance[account - 1] -= money;
                return true;
            }
        }
        return false;
    }
}
