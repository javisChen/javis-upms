package javis.app.common.contants;

/**
 * @author Javis
 * @desc  业务层返回状态码统一管理，状态码范围：0-199
 * @date 2017-11-12
 * @time 上午12:40
 */
public enum ResultEnum {

    OK(200, "ok"),
    ERROR(500, "服务器出现了一点问题！"),
    SYSTEM_EXCEPTION(500, "未知异常"),
    NO_LOGIN(401, "用户未登录"),
    ILLEGAL_ARGUMENT(402, "非法参数"),
    WRONG_CAPTCHA(402, "验证码不正确"),
    WRONG_LOGIN(402, "用户名或密码有误"),
    ;
    private int code;
    private String msg;

    ResultEnum(int result, String msg) {
        this.code = result;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
