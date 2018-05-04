package javis.app.cache;

/**
 * @author Javis
 * @desc缓存操作接口
 * @date 2017-11-18
 * @time 下午2:26
 */
public interface IBaseCache<T> {

    /**
     * 保存缓存
     * @param key 键
     * @param value 值
     * @param expires 存活时间
     */
    void set(String key, T value, long expires);

    /**
     * 获取缓存
     * @param key 键
     * @return T
     */
    T get(String key);

    /**
     * 删除缓存
     * @param key 键
     */
    void delete(String key);
}
