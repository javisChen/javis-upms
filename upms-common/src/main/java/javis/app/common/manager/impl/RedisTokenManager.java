//package javis.app.common.manager.impl;
//
//import javis.app.common.util.UUIDUtils;
//import javis.app.common.manager.ITokenManager;
//import javis.app.common.manager.Token;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Objects;
//
///**
// * @author Javis
// * @desc
// * @date 2017-11-19
// * @time 下午2:28
// */
//@Component
//public class RedisTokenManager implements ITokenManager {
//
//    @Autowired
//    private RedisCache<String> redisCache;
//
//    @Override
//    public Token createToken(RedisCacheEnum redisCacheEnum, String value) {
//        String token = UUIDUtils.generate() + value;
//        redisCache.set(redisCacheEnum.getFlag() + token, value, redisCacheEnum.getExpires());
//        return new Token(token);
//    }
//
//    @Override
//    public boolean checkToken(Token token, RedisCacheEnum redisCacheEnum) {
//        if (Objects.isNull(token)) {
//            return false;
//        }
//        String userPhone = redisCache.get(redisCacheEnum.getFlag() + token.getId());
//        if (StringUtils.isBlank(userPhone) || !StringUtils.equals(userPhone, token.getUserPhone())) {
//            return false;
//        }
//        // 如果验证成功，说明此用户进行了一次有效操作，延长 token 的过期时间
//        redisCache.set(redisCacheEnum.getFlag() + token.getId(), userPhone, redisCacheEnum.getExpires());
//        return true;
//    }
//
//    @Override
//    public boolean checkLoginUserToken(String token) {
//        if (StringUtils.isBlank(token)) {
//            return false;
//        }
//        String userPhone = redisCache.get(RedisCacheEnum.LOGIN_USER.getFlag() + token);
//        if (StringUtils.isBlank(userPhone)) {
//            return false;
//        }
//        // 如果验证成功，说明此用户进行了一次有效操作，延长 token 的过期时间
//        redisCache.set(RedisCacheEnum.LOGIN_USER.getFlag() + token, userPhone, RedisCacheEnum.LOGIN_USER.getExpires());
//        return true;
//    }
//
//    @Override
//    public Token getToken(String key, RedisCacheEnum redisCacheEnum) {
//        String value = redisCache.get(redisCacheEnum.getFlag() + key);
//        return new Token(value);
//    }
//
//    @Override
//    public void removeToken(Token token, RedisCacheEnum redisCacheEnum) {
//        String key = redisCacheEnum.getFlag() + token.getId();
//        redisCache.delete(key);
//    }
//}
