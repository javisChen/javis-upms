package javis.app.common.page;

import lombok.Data;
import lombok.ToString;

/*
 * @author JavisChen
 * @desc 接收请求分页参数统一封装
 * @date 2018/4/17 下午10:18
 */
@Data
@ToString
public class PageRequest {

    private int offset;
    private int limit;
}
