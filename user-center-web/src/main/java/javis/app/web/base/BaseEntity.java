package javis.app.web.base;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/*
 * @author JavisChen
 * @desc 基类
 * @date 2018/4/17 上午9:18
 */
@Data
@ToString
@Accessors(chain = true)
public abstract class BaseEntity<T> implements Serializable {

    private Integer id;

//    private Integer state;

    @TableField("is_deleted")
    private Integer isDeleted;

    @TableField("gmt_create")
    private Date gmtCreate;

    @TableField("gmt_modified")
    private Date gmtModified;

}
