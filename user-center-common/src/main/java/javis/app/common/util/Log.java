package javis.app.common.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Javis
 * @desc日志封装
 * @date 2017-11-10
 * @time 下午10:05
 */
public class Log {

    private static final int DEBUG_LEVEL = 0;
    private static final int WARN_LEVEL = 1;
    private static final int ERROR_LEVEL = 2;
    private static final int FATAL_LEVEL = 3;
    private static final int INFO_LEVEL = 99;
    private static final int TRACE_LEVEL = 100;

    private final static Logger LOGGER = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    public static void info(String s, Object... o) {
        l(INFO_LEVEL, s, o);
    }

    public static void debug(String s, Object... o) {
        l(DEBUG_LEVEL, s, o);
    }

    public static void error(String s, Object... o) {
        l(ERROR_LEVEL, s, o);
    }

    public static void warn(String s, Object... o) {
        l(WARN_LEVEL, s, o);
    }

    private static void l(int level, String format, Object[] msg) {
        String formatStr = createLogContent(format);
        switch (level) {
            case DEBUG_LEVEL:
                LOGGER.debug(formatStr, msg);
                break;
            case WARN_LEVEL:
                LOGGER.warn(formatStr, msg);
                break;
            case ERROR_LEVEL:
                LOGGER.error(formatStr, msg);
                break;
            case INFO_LEVEL:
                LOGGER.info(formatStr, msg);
                break;
            case TRACE_LEVEL:
                LOGGER.trace(formatStr, msg);
                break;
            default:
                break;
        }
    }

    private static String createLogContent(String s) {
        StackTraceElement stack = Thread.currentThread().getStackTrace()[4];
        return "{" + stack.getClassName() + "." + stack.getMethodName() + ":" + stack.getLineNumber() + "} " + s;
    }
}
