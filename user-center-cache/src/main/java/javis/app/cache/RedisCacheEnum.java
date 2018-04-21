//package javis.app.cache;
//
///**
// * @author Javis
// * @desc 统一管理Redis缓存信息
// * @date 2017-11-18
// * @time 下午10:31
// */
//public enum RedisCacheEnum {
//
//    /**
//     * 用户TOKEN
//     * 标记：LOGIN_USER_
//     * 保存时间：24小时
//     */
//    LOGIN_USER("LOGIN_USER_", 1000 * 60 * 30 * 2 * 24),
//
//    /**
//     * 登录验证码
//     * 标记：CAPTCHA_
//     * 保存时间：2分钟
//     */
//    CAPTCHA("CAPTCHA_", 1000 * 60 * 2);
//
//    private String flag;
//    private long expires;
//
//    RedisCacheEnum(String flag, int expires) {
//        this.flag = flag;
//        this.expires = expires;
//    }
//
//    public String getFlag() {
//        return flag;
//    }
//
//    public long getExpires() {
//        return expires;
//    }
//}
