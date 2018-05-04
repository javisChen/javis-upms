package javis.app.common.lay;


import javis.app.common.contants.ResultEnum;
import javis.app.common.page.Pager;
import javis.app.common.response.ServerResult;

import java.util.List;

/**
 * @desc 符合LayTable渲染格式结果
 * @author Javis
 * @date 2017-11-10
 * @time 下午10:05
 */
public class LayTableResult extends ServerResult<List> {

    private static final long serialVersionUID = -235405338438053042L;

    /**
     * 总数据量
     */
    private long count;

    public LayTableResult(Pager data) {
        super(ResultEnum.OK, data.getRows());
        this.count = data.getTotalCount();
    }

    public long getCount() {
        return count;
    }
}
