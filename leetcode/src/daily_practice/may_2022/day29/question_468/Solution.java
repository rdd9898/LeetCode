package daily_practice.may_2022.day29.question_468;

/**
 * 这题太烂了，有些 IPv6 的规则没有遵守
 * @author 胡阳
 * @ClassName Solution
 * @description: 468.验证 IP 地址
 * @date 2022年05月29日 9:41
 */
public class Solution {

    private static String invalidReturn = "Neither";

    public String validIPAddress(String queryIP) {

        String ans = invalidReturn;

        // 验证 IPv4
        if (queryIP.contains(".")) {
            String[] split = queryIP.split("\\.");

            int num = 0;
            for (int i = 0; i < queryIP.length(); i++) {
                if (queryIP.charAt(i) == '.') {
                    num++;
                }
            }
            if (num != 3) {
                return invalidReturn;
            }

            // 判断是否为 4 个
            if (split.length != 4) return invalidReturn;

            for (String s : split) {
                // 判断是否包含前导 0
                boolean zeroFirst = false;
                for (int i = 0; i < s.length(); i++) {
                    if (i == 0 && s.charAt(i) == '0') {
                        zeroFirst = true;
                    } else if (zeroFirst) {
                        return invalidReturn;
                    }
                    if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                        return invalidReturn;
                    }
                }
                if (s == null || s == "") {
                    return invalidReturn;
                }
                // 判断是否在合理范围内
                if (!(Integer.parseInt(s) >= 0 && Integer.parseInt(s) <= 255)) {
                    return invalidReturn;
                }
            }
            ans = "IPv4";
        }
        // 验证 IPv6
        if (queryIP.contains(":")) {
            String[] split = queryIP.split(":");
            int num = 0;
            for (int i = 0; i < queryIP.length(); i++) {
                if (queryIP.charAt(i) == ':') {
                    num++;
                }
            }
            if (num != 7) {
                return invalidReturn;
            }
            // 判断是否为 8 个
            if (split.length != 8) return invalidReturn;
            // 判断是否可以有前导 0
            boolean zeroFirst = true;
            for (String s : split) {
                if (s.length() < 4 && !(s.length() == 1 && s.charAt(0) == '0')) {
                    zeroFirst = false;
                } else if (s.length() >= 5 || s.length() == 0) {
                    // 如果长度不符合标准，返回不合理
                    return invalidReturn;
                }
            }
            for (String s : split) {

                if (s == null || s == "") {
                    return invalidReturn;
                }

                // 不能包含前导 0
                if (!zeroFirst) {
                    for (int i = 0; i < s.length(); i++) {
                        // 只有一个 0 合理，但长度小于 4 时，不能有前导 0
                        if (s.charAt(i) == '0' && i == 0 && s.length() > 1) {
                            return invalidReturn;
                        }
                        // 判断每个字符是否符合要求
                        if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'f') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'F')) {
                            continue;
                        } else {
                            return invalidReturn;
                        }
                    }
                } else {
                    for (int i = 0; i < s.length(); i++) {
                        // 判断每个字符是否符合要求
                        if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'f') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'F')) {
                            continue;
                        } else {
                            return invalidReturn;
                        }
                    }
                }
            }
            ans = "IPv6";
        }
        return ans;
    }

}
