package daily_practice.april_2023.day11.question_1041;

/**
 * @program: LeetCode
 * @description: 1041.困于环中的机器人
 * @author: Mr.Hu
 * @create: 2023-04-11 09:43
 **/
public class Solution {

    private int[][] steps = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public boolean isRobotBounded(String instructions) {
        int direction = 0;
        int[] position = {0, 0};
        for (int i = 0; i < 4; i++) {
            for (char c : instructions.toCharArray()) {
                if (c == 'G') {
                    position[0] += steps[direction][0];
                    position[1] += steps[direction][1];
                } else if (c == 'L') {
                    if (direction == 0) direction = 3;
                    else direction--;
                } else {
                    if (direction == 3) direction = 0;
                    else direction++;
                }
            }
        }
        return direction == 0 && position[0] == 0 && position[1] == 0;
    }

}
