package javis.app.web.config;

import com.xiaoleilu.hutool.setting.dialect.Props;

/**
 * @author Javis
 * @desc系统配置封装
 * @date 2017-11-13
 * @time 下午11:25
 */
public class SystemConfig {

    private static final Props SYSTEM_PROS = new Props("system.properties");

    // 应用上下文路径
    public static final String CONTEXT_PATH = SYSTEM_PROS.getStr("context_path");

    // 文件上传路径
    public static final String UPLOAD_PATH = SYSTEM_PROS.getStr("upload_path");

    private SystemConfig() {

    }
}
