package javis.app.web.base;


import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

/**
 * @author Javis
 * @desc
 * @date 2017-11-14
 * @time 上午1:37
 */
@Data
@ToString
@Accessors(chain = true)
public abstract class BaseController {

    @Autowired
    private HttpSession session;

    protected String getSessionId() {
        return session.getId();
    }
}
