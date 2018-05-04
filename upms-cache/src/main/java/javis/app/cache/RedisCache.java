//package javis.app.cache;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * @author Javis
// * @descRedis缓存
// * @date 2017-11-18
// * @time 下午2:24
// */
//@Component
//public class RedisCache<T> implements IBaseCache<T> {
//
//    @Autowired
//    private RedisTemplate<String, T> redisTemplate;
//
//    @Override
//    public void set(String key, T value, long expires) {
//        redisTemplate.boundValueOps(key).set(value, expires, TimeUnit.MILLISECONDS);
//    }
//
//    @Override
//    public T get(String key) {
//        return redisTemplate.boundValueOps(key).get();
//    }
//
//    @Override
//    public void delete(String key) {
//        redisTemplate.delete(key);
//    }
//}
