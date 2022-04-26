package hy.day01;

public class MachineTest {
    public static void main(String[] args) {
        int[] machines = {1, 0, 5};
        SuperWashingMachine swm = new SuperWashingMachine();
        int moves = swm.findMinMoves(machines);
        System.out.println(moves);

        System.out.println("------------");
        int[] machines2 = {1, 0, 0, 3, 1};
        SuperWashingMachine2 swm2 = new SuperWashingMachine2();
        System.out.println(swm2.findMinMoves(machines2));
    }
}
