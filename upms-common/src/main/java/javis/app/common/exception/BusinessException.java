package javis.app.common.exception;

import javis.app.common.contants.ResultEnum;
import lombok.Getter;

/*
 * @author JavisChen
 * @desc 业务异常
 * @date 2018/4/17 下午10:27
 */
@Getter
public class BusinessException extends RuntimeException {

    private int code;

    public BusinessException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public BusinessException(String msg) {
        super(msg);
        this.code = ResultEnum.ILLEGAL_ARGUMENT.getCode();
    }

    public BusinessException(ResultEnum resultEnum, String msg) {
        super(msg);
        this.code = resultEnum.getCode();
    }
}
