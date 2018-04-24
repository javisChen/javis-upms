package javis.app.web.base;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/*
 * @author JavisChen
 * @desc 接收请求分页参数统一封装
 * @date 2018/4/17 下午10:18
 */
@Data
@ToString
@Accessors(chain = true)
public class BaseRequestParam {

    private int offset;
    private int limit;
}
