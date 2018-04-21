package javis.app.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Javis
 * @desc 系统会自动将标记该注解的方法参数记录到日志中
 * @date 2017-11-12
 * @time 下午9:22
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Log {

    /**
     * 描述
     */
    String desc();
}
