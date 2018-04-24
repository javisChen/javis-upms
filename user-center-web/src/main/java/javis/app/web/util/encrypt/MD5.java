package javis.app.web.util.encrypt;

import com.xiaoleilu.hutool.crypto.SecureUtil;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-04-23
 * @time 上午12:05
 */
public class MD5 {

    public static String md5ToUpper(String str) {
        return SecureUtil.md5(str).toUpperCase();
    }

    public static void main(String[] args) {
        String s = SecureUtil.md5("123").toUpperCase();
        System.out.println(s.length());
    }
}
