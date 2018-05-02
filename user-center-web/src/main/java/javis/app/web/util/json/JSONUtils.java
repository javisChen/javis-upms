package javis.app.web.util.json;

import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-02
 * @time 下午1:02
 */
public class JSONUtils {

    public static JSONObject streamToJson(InputStream is) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String content = null;
        StringBuilder builder = new StringBuilder();
        while ( (content = reader.readLine()) != null) {
            builder.append(content);
        }
        return JSONObject.parseObject(builder.toString());
    }
}
