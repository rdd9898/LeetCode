package daily_practice.june_2022.day29.question_535;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 胡阳
 * @ClassName Codec
 * @description: 535.TinyURL 的加密与解密
 * @date 2022年06月29日 9:21
 */
public class Codec {

    Map<Integer, String> map = new HashMap<>();
    int id = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(id, longUrl);
        return longUrl + '/' + String.valueOf(id);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int index = shortUrl.lastIndexOf('/') + 1;
        String id = shortUrl.substring(index);
        return map.get(Integer.parseInt(id));
    }

}
