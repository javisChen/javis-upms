package javis.app.common.response;

import javis.app.common.contants.ResultEnum;
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
public class ServerResult<T> implements Serializable {

    private static final long serialVersionUID = -5409913864886373072L;
    private int code;
    private String msg;
    private T data;
    protected boolean isSuccess() {
        return this.code == ResultEnum.OK.getCode();
    }

    public ServerResult(ResultEnum resultEnum, T data) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.data = data;
    }

    public ServerResult(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public ServerResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
