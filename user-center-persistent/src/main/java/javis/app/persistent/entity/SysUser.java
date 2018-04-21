package javis.app.persistent.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableLogic;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统用户
 * </p>
 *
 * @author javis
 * @since 2018-04-21
 */
@Data
@Accessors(chain = true)
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
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
    @TableField("realname")
    private String ealname;
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
    private String profilePhoto;
    /**
     * 身份证
     */
    private String idCardNo;
    /**
     * 注册IP
     */
    @TableField("register_ip")
    private String egisterIp;
    /**
     * 注册时间
     */
    @TableField("register_time")
    private Date egisterTime;
    /**
     * 账号锁定状态 0=正常，1=已锁定
     */
    private Integer lockStatus;
    /**
     * 账号被锁定时间
     */
    private Date lockTime;
    /**
     * 账号被锁原因
     */
    private String lockReason;
    /**
     * 逻辑删除状态 0=正常 1=已删除
     */
    @TableLogic
    private Integer isDeleted;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 更新时间
     */
    private Date gmtModified;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
