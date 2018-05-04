package javis.app.common.base;

import lombok.Data;
import lombok.ToString;

/*
 * @author JavisChen
 * @desc
 * @date 2018/4/17 下午10:29
 */
@ToString
@Data
public abstract class BaseRequestParam {

    private int offset;

    private int limit;

}
