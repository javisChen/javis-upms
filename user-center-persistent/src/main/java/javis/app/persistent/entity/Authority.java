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
@TableName("authority")
public class Authority extends Model<Authority> {

    private static final long serialVersionUID = 1L;

    /**
     * 权限id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 权限名称
     */
    private String name;
    /**
     * 角色id
     */
    @TableField("role_id")
    private Integer oleId;
    /**
     * 权限类型 0=菜单权限，1=操作权限
     */
    private Integer type;
    /**
     * 可用状态 0=可用，1=禁用
     */
    private Integer state;
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
