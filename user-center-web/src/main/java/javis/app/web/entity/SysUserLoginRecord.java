package javis.app.web.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import javis.app.web.base.BaseEntity;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户登录记录表
 * </p>
 *
 * @author javis
 * @since 2018-04-22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sys_user_login_record")
public class SysUserLoginRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 登录时间
     */
    @TableField("login_time")
    private Date loginTime;
    /**
     * 登出时间
     */
    @TableField("logout_time")
    private Date logoutTime;
    /**
     * 会话id
     */
    @TableField("session_id")
    private String sessionId;
    /**
     * 登录系统的代理程序
     */
    @TableField("login_ip")
    private String loginIp;


}
