package javis.upms.web.constants;

/*
 * @author JavisChen
 * @desc 数据表对应的常量
 * @date 2018/6/5 上午11:06
 */
public class DataConst {

    public interface User {
        int LOCK_STATUS_REGULAR = 0; // 正常
        int LOCK_STATUS_LOCKED = 1;  // 已锁定
    }
}
