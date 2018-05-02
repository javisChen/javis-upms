package javis.app.web.base;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.log4j.Log4j2;

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
@Log4j2
public abstract class BaseEntity<T> extends BaseRequestParam<T> implements Serializable, EntityWrapperBuilder<T> {

    private Integer id;

//    private Integer state;

    @TableField("is_deleted")
    private Integer isDeleted;

    @TableField("gmt_create")
    private Date gmtCreate;

    @TableField("gmt_modified")
    private Date gmtModified;

//    public EntityWrapper<T> getEntityWrapper() throws IllegalAccessException {
//        Field[] fields = this.getClass().getDeclaredFields();
//        EntityWrapper<T> ew = new EntityWrapper<>();
//        Columns columns = Columns.create();
//        for (Field field : fields) {
//            String name = field.getName();
//            if (name.equals("serialVersionUID")) {
//                continue;
//            }
//
//            TableField annotation = field.getAnnotation(TableField.class);
//            if (annotation!= null) {
//                name = annotation.value();
//            }
//
//            columns.column(name);
//
//            Class<?> type = field.getType();
//            field.setAccessible(true);
//            Object fieldValue = field.get(this);
//            if (fieldValue != null) {
//                if (type.getName().equals("java.lang.String")) {
//                    ew.like(name, (String) fieldValue);
//                } else {
//                    ew.eq(name, fieldValue);
//                }
//            }
//        }
//        ew.setSqlSelect(columns);
//        log.debug("查询SQL：{}", ew.originalSql() );
////        return new EntityWrapper<T>().eq("id", 1);
//        return ew;
//    }
}
