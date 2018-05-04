package javis.app.web.entity;

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
@TableName("sys_authority")
public class SysAuthority extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 权限名称
     */
    private String name;
    /**
     * 角色id
     */
    @TableField("role_id")
    private Integer roleId;
    /**
     * 权限类型 0=菜单权限，1=操作权限
     */
    private Integer type;
    /**
     * 可用状态 0=可用，1=禁用
     */
    private Integer state;


}
