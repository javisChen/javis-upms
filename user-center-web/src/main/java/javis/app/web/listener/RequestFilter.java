package javis.app.web.listener;

import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-02
 * @time 下午12:01
 */
@WebFilter(filterName = "requestFilter", urlPatterns = "/*")
@Log4j2
public class RequestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {

//        ServletInputStream is = servletRequest.getInputStream();
//        this.setPageContext(is);
        chain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }

    public void setPageContext(InputStream is) {
//        JSONObject jsonObject = null;
//        try {
//            jsonObject = JSONUtils.streamToJson(is);
//            PageContext.set(new Pager()
//                            .limit(jsonObject.getInteger(Pager.LIMIT_FILED))
//                            .offset(jsonObject.getInteger(Pager.OFFSET_FILED))
//                            .orderByField(jsonObject.getString(Pager.ORDER_BY_FILED))
//                            .isAsc(jsonObject.getBoolean(Pager.IS_ASC_FILED)));
//        } catch (IOException e) {
//            log.error("设置分页上下文【setPageContext】ERROR：{}", e);
//        }
    }
}
