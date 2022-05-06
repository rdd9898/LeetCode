package daily_practice.undefined_2022.hy.day29;

//方法一：一次遍历
//对于 0 \le i < n0≤i<n，第 ii 个按下的键是 \textit{keysPressed}[i]keysPressed[i]，按键持续时间是 \textit{releaseTimes}[i] - \textit{releaseTimes}[i - 1]releaseTimes[i]−releaseTimes[i−1]，这里规定 \textit{releaseTimes}[-1] = 0releaseTimes[−1]=0，因为第 00 个键在时间 00 被按下。
//
//为了得到按键持续时间最长的键，需要遍历 \textit{keysPressed}keysPressed 和 \textit{releaseTimes}releaseTimes，计算每个按键持续的时间并记录按键持续的最长时间和对应的按键。
//
//为了避免处理下标越界问题，首先记录第 00 个按键，按键持续时间是 \textit{releaseTimes}[0]releaseTimes[0]，按下的键是 \textit{keysPressed}[0]keysPressed[0]，将其记为按键持续的最长时间和对应的按键。然后遍历其余的按键，对于每个按键，当以下两个条件之一成立时，使用当前按键更新按键持续的最长时间和对应的按键：
//
//当前按键持续时间大于按键持续的最长时间；
//
//当前按键持续时间等于按键持续的最长时间且当前按键大于按键持续时间最长的键。
//
//遍历结束之后，即可得到按键持续时间最长的键。

public class NormalSolution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        char ans = keysPressed.charAt(0);
        int maxTime = releaseTimes[0];
        for (int i = 1; i < n; i++) {
            char key = keysPressed.charAt(i);
            int time = releaseTimes[i] - releaseTimes[i - 1];
            if (time > maxTime || (time == maxTime && key > ans)) {
                ans = key;
                maxTime = time;
            }
        }
        return ans;
    }
}
