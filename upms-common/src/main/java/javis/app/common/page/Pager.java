//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package javis.app.common.page;

import com.github.pagehelper.Page;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/*
 * @author JavisChen
 * @desc 分页器
 * @date 2018/4/17 下午10:21
 */
@Data
@ToString
public class Pager<T> implements Serializable {

    private static final long serialVersionUID = 8656597559014685635L;
    private long totalCount;
    private List<T> rows;
    private int pageNo;
    private int pageSize;
    private int totalPage;

    public Pager(List<T> list) {
        if (list instanceof Page) {
            Page<T> page = (Page<T>) list;
            this.pageNo = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.totalCount = page.getTotal();
            this.totalPage = page.getPages();
            this.rows = page;
        }
    }

}
