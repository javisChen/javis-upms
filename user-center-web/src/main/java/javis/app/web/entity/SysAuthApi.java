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
@TableName("sys_auth_api")
public class SysAuthApi extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 权限id
     */
    @TableField("auth_id")
    private Integer authId;
    /**
     * api名称
     */
    private String name;
    /**
     * 操作url
     */
    private String url;
    /**
     * 接口版本 默认：1
     */
    private Integer version;
    /**
     * 可用状态 0=可用，1=禁用
     */
    private Integer state;


}
