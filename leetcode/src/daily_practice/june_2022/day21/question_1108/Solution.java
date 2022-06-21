package daily_practice.june_2022.day21.question_1108;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1108.IP 地址无效化
 * @date 2022年06月21日 8:55
 */
public class Solution {

    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            } else sb.append(address.charAt(i));
        }
        return sb.toString();
    }

}
