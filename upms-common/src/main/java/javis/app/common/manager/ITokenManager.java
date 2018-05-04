//package javis.app.common.manager;
//
///**
// * @author Javis
// * @desc
// * @date 2017-11-19
// * @time 下午2:17
// */
//public interface ITokenManager {
//    /**
//     * 创建一个Token并缓存到Redis
//     * @param RedisCacheEnum 缓存信息枚举
//     * @param value 指定用户的 id
//     * @return Token
//     */
//    Token createToken(RedisCacheEnum RedisCacheEnum, String value);
//
//    /**
//     * 检查token 是否有效
//     * @param model token
//     * @param redisCacheEnum 缓存信息枚举
//     * @return 是否有效
//     */
//    boolean checkToken(Token model, RedisCacheEnum redisCacheEnum);
//
//    /**
//     * 检查登录用户Token 是否有效
//     * @param token
//     * @return 是否有效
//     */
//    boolean checkLoginUserToken(String token);
//
//    /**
//     * 获取Token
//     * @param authentication
//     * @param redisCacheEnum
//     * @return
//     */
//    Token getToken(String authentication, RedisCacheEnum redisCacheEnum);
//
//    /**
//     * 清除 token
//     * @param token 登录用户的 id
//     * @param redisCacheEnum
//     */
//    void removeToken(Token token, RedisCacheEnum redisCacheEnum);
//}
