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
public class AuthApi extends Model<AuthApi> {

    private static final long serialVersionUID = 1L;

    /**
     * Api id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 权限id
     */
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
