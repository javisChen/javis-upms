package javis.app.web.entity;

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
@TableName("sys_user_group")
public class SysUserGroup extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户组名称
     */
    private String name;
    private String level;
    /**
     * 父级id
     */
    private Integer pid;


}
