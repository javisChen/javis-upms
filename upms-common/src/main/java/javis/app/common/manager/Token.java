package javis.app.common.manager;

/**
 * @author Javis
 * @descToken实体
 * @date 2017-11-19
 * @time 下午2:18
 */
public class Token {

    private String id;
    private String userPhone;

    public Token(String value, String userPhone) {
        this.id = value;
        this.userPhone = userPhone;
    }

    public Token(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Token() {
    }
}
