package javis.app.web.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
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
 * 用户登录记录表
 * </p>
 *
 * @author javis
 * @since 2018-04-21
 */
@Data
@Accessors(chain = true)
@TableName("sys_user_login_record")
public class SysUserLoginRecord extends Model<SysUserLoginRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户登录记录id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 登录时间
     */
    private Date loginTime;
    /**
     * 登出时间
     */
    private Date logoutTime;
    /**
     * 会话id
     */
    private String sessionId;
    /**
     * 登录系统的代理程序
     */
    private String loginIp;
    /**
     * 逻辑删除标识 0=未删除，1=已删除
     */
    @TableLogic
    private Integer isDeleted;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    private Date gmtModified;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
