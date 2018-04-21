package javis.app.common.response;

import javis.app.common.contants.ResultEnum;
import javis.app.common.exception.BusinessException;
import javis.app.common.page.Pager;
import javis.app.common.lay.LayTableResult;

/*
 * @author JavisChen
 * @desc 系统响应辅助类
 * @date 2018/4/17 下午10:25
 */
public class SysResponse<T> {

    public static ServerResult success() {
        return new ServerResult<>(ResultEnum.OK, null);
    }
    public static <T> ServerResult success(T data) {
        return new ServerResult<>(ResultEnum.OK, data);
    }

    public static ServerResult error() {
        return new ServerResult<>(ResultEnum.ERROR);
    }

    public static ServerResult error(ResultEnum resultEnum) {
        return new ServerResult<>(resultEnum);
    }

    public static ServerResult error(BusinessException e) {
        return new ServerResult<>(e.getCode(), e.getMessage());
    }

    public static LayTableResult layTable(Pager pager) {
        return new LayTableResult(pager);
    }
}
