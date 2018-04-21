package javis.app.persistent.base;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/*
 * @author JavisChen
 * @desc 基类
 * @date 2018/4/17 上午9:18
 */
@Data
@ToString
public class BaseEntity {

    private Integer id;

    private Boolean state;

    private Boolean isDeleted;

    private Date gmtCreate;

    private Date gmtModified;

}
