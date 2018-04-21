package javis.app.persistent.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
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
@TableName("role_user_group_r")
public class OleUserGroupR extends Model<OleUserGroupR> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户组id
     */
    private Integer userGroupId;
    /**
     * 角色id
     */
    @TableField("role_id")
    private Integer oleId;
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
