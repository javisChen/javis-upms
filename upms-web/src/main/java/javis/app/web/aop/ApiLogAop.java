package javis.app.web.aop;

import javis.app.web.annotation.SysLog;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @author Javis
 * @desc使用Aop拦截Controller层需要进行日志记录的API
 * @date 2017-11-12
 * @time 下午6:02
 */
@Component
@Aspect
@Log4j2
public class ApiLogAop {

    /**
     * 在方法执行前执行
     * @param joinPoint 连接点
     */
    @Before("@annotation(javis.app.web.annotation.SysLog)")
    private void doBefore(JoinPoint joinPoint) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        Method targetMethod = ((MethodSignature) joinPoint.getSignature()).getMethod();
        SysLog annotation = targetMethod.getAnnotation(SysLog.class);
        log.info("{=========================request=========================");
        log.info("{url = {}}", request.getRequestURL());
        log.info("{method = {}}", request.getMethod());
        log.info("{ip = {}}", request.getRemoteAddr());
        log.info("{desc = {}}", annotation.desc());
        log.info("{args = {}}", joinPoint.getArgs());
        log.info("{=========================request=========================");
    }

}
