package daily_practice.undefined_2022.hy2.day64;

import java.util.HashMap;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年04月10日 13:21
 */
public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String, Integer> map = new HashMap<>();
        int ans = 0;
        for (String word : words) {
            StringBuffer stringBuffer = new StringBuffer();
            for (char c : word.toCharArray()) {
                stringBuffer.append(code[c-'a']);
            }
            if (map.getOrDefault(stringBuffer.toString(), 0) == 0) {
                ans++;
            }
            map.put(stringBuffer.toString(), 1);
        }
        return ans;
    }
}
