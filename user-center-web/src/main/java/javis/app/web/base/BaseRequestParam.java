package javis.app.web.base;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.plugins.Page;
import javis.app.web.support.page.Pager;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/*
 * @author JavisChen
 * @desc 接收请求分页参数统一封装
 * @date 2018/4/17 下午10:18
 */
@Setter
@ToString
@Accessors(chain = true)
public class BaseRequestParam<T> {

    @TableField(exist = false)
    private Pager page;

    public Page<T> page() {
        if (page == null) {
            return new Page<T>(1, 10, null, true);
        }
        return new Page<T>(page.getLimit(), page.getOffset(), page.getOrderByField(), page.isAsc());
    }
}
