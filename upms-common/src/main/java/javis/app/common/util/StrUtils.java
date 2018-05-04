package javis.app.common.util;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * @author Javis
 * @desc 字符串操作工具类封装
 * @date 2017-11-12
 * @time 下午11:52
 */
public class StrUtils {

    public static <T> String mapToParamsStr(Map<String, Object[]> map) {
        for (Map.Entry<String, Object[]> stringEntry : map.entrySet()) {
            Object[] value = stringEntry.getValue();
            for (Object o : value) {
                System.out.println(o);
            }
        }
        return null;
    }

    public static boolean equalsIgnoreCase(String str1, String str2) {
        return StringUtils.equalsIgnoreCase(str1, str2);
    }

    public static boolean isNotBlank(String str) {
        return StringUtils.isNotBlank(str);
    }

    public static boolean isBlank(String str) {
        return StringUtils.isBlank(str);
    }
}
