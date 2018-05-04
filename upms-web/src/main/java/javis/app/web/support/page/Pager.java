package javis.app.web.support.page;

import com.baomidou.mybatisplus.plugins.Page;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-02
 * @time 上午10:17
 */
@Accessors(chain = true)
@Data
public class Pager<T> {

    public static String LIMIT_FILED = "limit";
    public static String OFFSET_FILED = "offset";
    public static String IS_ASC_FILED = "isAsc";
    public static String ORDER_BY_FILED = "orderBy";

    private Integer offset;
    private Integer limit;
    private String orderByField;
    private boolean isAsc;

    public Page<T> getPage() {
        return new Page<T>(limit, offset, orderByField, isAsc);
    }

}
