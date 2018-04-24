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
@TableName("sys_file")
public class SysFile extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 文件名称
     */
    private String name;
    /**
     * 文件相对路径
     */
    private String path;
    /**
     * 文件大小 单位：字节
     */
    private Integer size;
    /**
     * 接口版本 默认：1
     */
    private Integer type;
    /**
     * 可用状态 0=可用，1=禁用
     */
    private Integer state;


}
