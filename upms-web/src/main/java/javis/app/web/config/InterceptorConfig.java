//package javis.app.web.config;
//
//import com.alibaba.fastjson.JSONObject;
//import com.google.common.collect.Sets;
//import com.vdance.util.ConfigUtils;
//
//import java.util.Arrays;
//import java.util.Set;
//
///**
// * @author Javis
// * @desc 拦截器配置
// * @date 2017-11-13
// * @time 下午11:25
// */
//public class InterceptorConfig {
//
//    private static final JSONObject INTERCEPTOR_CONFIG = ConfigUtils.loadJsonConfig("config/web/interceptor-config.json");
//
//    private static JSONObject LOGIN_INTERCEPTOR = INTERCEPTOR_CONFIG.getJSONObject("login");
//
//    /**
//     * 登录拦截器排除的URL
//     */
//    public static Set<Object> LOGIN_EXCLUDE_URL_SET = Sets.newHashSet(Arrays.asList(LOGIN_INTERCEPTOR.getJSONArray("excludeUrls").toArray()));
//
//    private InterceptorConfig() {
//
//    }
//}
