package javis.app.web.base;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.entity.Columns;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

import java.lang.reflect.Field;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-02
 * @time 下午8:48
 */
public interface EntityWrapperBuilder<T> {

    default EntityWrapper<T> buildEntityWrapper() throws IllegalAccessException {
        Field[] fields = this.getClass().getDeclaredFields();
        EntityWrapper<T> ew = new EntityWrapper<>();
        Columns columns = Columns.create();
        for (Field field : fields) {
            String name = field.getName();
            if (name.equals("serialVersionUID")) {
                continue;
            }

            TableField annotation = field.getAnnotation(TableField.class);
            if (annotation!= null) {
                name = annotation.value();
            }

            if (!name.equals("password")) {
                columns.column(name);
            }

            Class<?> type = field.getType();
            field.setAccessible(true);
            Object fieldValue = field.get(this);
            if (fieldValue != null) {
                if (type.getName().equals("java.lang.String")) {
                    ew.like(name, (String) fieldValue);
                } else {
                    ew.eq(name, fieldValue);
                }
            }
        }
        ew.setSqlSelect(columns);
        return ew;
    }
}
