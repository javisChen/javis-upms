package javis.app.web.util;

import com.alibaba.fastjson.JSONObject;

/**
 * @author Javis
 * @desc 配置工具类
 * @date 2017-11-14
 * @time 上午12:24
 */
public class ConfigUtils {

	/**
	 * 加载Json类型的配置文件
	 * @param configPath 配置文件路径
	 * @return
	 */
	public static JSONObject loadJsonConfig(String configPath) {
		String s = FileUtils.readFileFromClassPath(configPath);
		return JSONObject.parseObject(s);
	}
}