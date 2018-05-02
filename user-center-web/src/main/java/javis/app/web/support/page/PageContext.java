package javis.app.web.support.page;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-02
 * @time 下午1:32
 */
public class PageContext {

    public static ThreadLocal<Pager> PAGER_THREAD_LOCAL = new ThreadLocal<>();

    public static Pager get() {
        return PAGER_THREAD_LOCAL.get() == null ? new Pager() : PAGER_THREAD_LOCAL.get();
    }

    public static void set(Pager pager) {
        PAGER_THREAD_LOCAL.set(pager);
    }

    public static void remove() {
        PAGER_THREAD_LOCAL.remove();
    }

}
