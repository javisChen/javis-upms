package javis.app.common.util;

import com.alibaba.fastjson.JSONObject;

/**
 * 简单封装JSONObject
 * @author javischen
 */
public class JsonObject extends JSONObject {

    private static final long serialVersionUID = -3156872902653235071L;

    public static JsonObject create() {
        return new JsonObject();
    }

    public static JsonObject create(String key, Object value) {
        return new JsonObject().elem(key, value);
    }

    public JsonObject elem(String key, Object value) {
        this.put(key, value);
        return this;
    }

    public static void main(String[] args) {

    }

}
