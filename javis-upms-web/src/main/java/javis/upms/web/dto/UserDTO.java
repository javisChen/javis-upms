package javis.upms.web.dto;

import javis.upms.web.base.BaseRequestParam;
import lombok.Data;

@Data
public class UserDTO extends BaseRequestParam<UserDTO> {

    /**
     * 用户账号
     */
    private String account;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 性别 0=女，1=男
     */
    private Integer gender;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像
     */
    private String profilePhoto;
    /**
     * 账号锁定状态 0=正常，1=已锁定
     */
    private Integer lockStatus;
    /**
     * 账号被锁原因
     */
    private String lockReason;
}
