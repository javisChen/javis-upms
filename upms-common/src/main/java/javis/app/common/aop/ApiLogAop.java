//package javis.app.common.aop;
//
//import com.vdance.annotation.Log;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//import java.lang.reflect.Method;
//
///**
// * @author Javis
// * @desc使用Aop拦截Controller层需要进行日志记录的API
// * @date 2017-11-12
// * @time 下午6:02
// */
//@Component
//public class ApiLogAop {
//
//    /**
//     * 在方法执行前执行
//     * @param joinPoint 连接点
//     */
//    private void doBefore(JoinPoint joinPoint) {
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        Method targetMethod = ((MethodSignature) joinPoint.getSignature()).getMethod();
//        Log annotation = targetMethod.getAnnotation(Log.class);
//        com.vdance.util.Log.info("{=========================request=========================");
//        com.vdance.util.Log.info("{url = {}}", request.getRequestURL());
//        com.vdance.util.Log.info("{method = {}}", request.getMethod());
//        com.vdance.util.Log.info("{ip = {}}", request.getRemoteAddr());
//        com.vdance.util.Log.info("{desc = {}}", annotation.desc());
//        com.vdance.util.Log.info("{args = {}}", joinPoint.getArgs());
//        com.vdance.util.Log.info("{=========================request=========================");
//    }
//
//}
