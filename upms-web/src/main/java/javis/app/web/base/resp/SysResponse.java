package javis.app.web.base.resp;

import javis.app.common.contants.ResultEnum;
import javis.app.common.exception.BusinessException;
import javis.app.common.lay.LayTableResult;
import javis.app.common.page.Pager;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/*
 * @author JavisChen
 * @desc 服务端响应结果封装
 * @date 2018/4/17 下午10:24
 */
@Data
@ToString
public class SysResponse<T> implements Serializable {

    private static final long serialVersionUID = -5409913864886373072L;
    private int code;
    private String msg;
    private T data;
    protected boolean isOK() {
        return this.code == ResultEnum.OK.getCode();
    }

    public SysResponse(ResultEnum resultEnum, T data) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.data = data;
    }

    public SysResponse(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public SysResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static SysResponse ok() {
        return new SysResponse<>(ResultEnum.OK, null);
    }
    public static <T> SysResponse ok(T data) {
        return new SysResponse<>(ResultEnum.OK, data);
    }

    public static SysResponse error() {
        return new SysResponse<>(ResultEnum.ERROR);
    }

    public static SysResponse error(ResultEnum resultEnum) {
        return new SysResponse<>(resultEnum);
    }

    public static SysResponse error(BusinessException e) {
        return new SysResponse<>(e.getCode(), e.getMessage());
    }

    public static LayTableResult layTable(Pager pager) {
        return new LayTableResult(pager);
    }
}
