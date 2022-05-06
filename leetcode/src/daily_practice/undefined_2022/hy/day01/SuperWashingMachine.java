package daily_practice.undefined_2022.hy.day01;

public class SuperWashingMachine {
    public int findMinMoves(int[] machines){
        int clothes = 0; //衣服总量
        for (int x=0; x<machines.length; x++){
            clothes += machines[x];
        }
        if (clothes % machines.length != 0){
            return -1;
        } else {
            int need = clothes / machines.length; //每台洗衣机所放衣服数量
            int num = 0; //操作步数
            boolean flag = false; //当前是否分配完成标志符
            while (!flag){
                num++;
                for (int x=0; x<machines.length; x++){
                    if (machines[x] != need && x != machines.length-1){
                        if (machines[x] < need && machines[x+1] > 0){
                            machines[x] += 1;
                            machines[x+1] -= 1;
                        }
/*                        else if (machines[x] > need && machines[x+1] < ){
                            machines[x] -= 1;
                            machines[x+1] += 1;
                        }*/
                    }
                }
                flag = true;
                for (int x=0; x<machines.length-1; x++){
                    if (machines[x] != need){
                        flag = false;
                        break;
                    }
                }
            }
            return num;
        }
    }
}
