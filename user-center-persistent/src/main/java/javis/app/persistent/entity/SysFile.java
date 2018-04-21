package javis.app.persistent.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
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
public class SysFile extends Model<SysFile> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户组id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
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
