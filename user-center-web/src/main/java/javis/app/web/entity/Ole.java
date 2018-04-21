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
@TableName("role")
public class Ole extends Model<Ole> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 角色名称
     */
    private String name;
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
