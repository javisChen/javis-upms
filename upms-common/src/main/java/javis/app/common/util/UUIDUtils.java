package javis.app.common.util;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Javis
 * @descUUID工具类
 * @date 2017-11-18
 * @time 下午10:07
 */
public class UUIDUtils {

    private static ReentrantLock lock = new ReentrantLock();

    /**
     * 生成UUID
     * @return String
     */
    public static String generate() {
        try {
            lock.lock();
            return StringUtils.upperCase(UUID.randomUUID().toString().replace("-", ""));
        } finally {
            lock.unlock();
        }
    }
}
