package javis.app.web.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import javis.app.web.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 系统用户
 * </p>
 *
 * @author javis
 * @since 2018-04-22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sys_user")
public class SysUser extends BaseEntity<SysUser> {

    private static final long serialVersionUID = 1L;

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
     * 昵称
     */
    private String nickname;
    /**
     * 真实姓名
     */
    private String realname;
    /**
     * 地址
     */
    private String address;
    /**
     * 性别 0=女，1=男
     */
    private Integer gender;
    /**
     * 头像
     */
    @TableField("profile_photo")
    private String profilePhoto;
    /**
     * 身份证
     */
    @TableField("id_card_no")
    private String idCardNo;
    /**
     * 注册IP
     */
    @TableField("register_ip")
    private String registerIp;
    /**
     * 注册时间
     */
    @TableField("register_time")
    private Date registerTime;
    /**
     * 账号锁定状态 0=正常，1=已锁定
     */
    @TableField("lock_status")
    private Integer lockStatus;
    /**
     * 账号被锁定时间
     */
    @TableField("lock_time")
    private Date lockTime;
    /**
     * 账号被锁原因
     */
    @TableField("lock_reason")
    private String lockReason;


}
