//package javis.app.common.util;
//
//import com.vdance.config.SystemConfig;
//import com.xiaoleilu.hutool.io.FileUtil;
//import com.xiaoleilu.hutool.util.URLUtil;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.multipart.MultipartHttpServletRequest;
//import org.springframework.web.multipart.commons.CommonsMultipartResolver;
//
//import javax.servlet.http.HttpServletRequest;
//import java.io.File;
//import java.io.IOException;
//import java.net.URL;
//import java.util.Iterator;
//import java.util.Objects;
//
///**
// * @author Javis
// * @desc 文件操作工具类
// * @date 2017-11-14
// * @time 上午12:24
// */
//public class FileUtils {
//
//    /**
//     * 文件上传
//     * @param request 请求对象
//     */
//    public static String uploadFile(HttpServletRequest request) {
//        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
//        if (multipartResolver.isMultipart(request)) {
//            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
//            Iterator<String> ite = multiRequest.getFileNames();
//            while (ite.hasNext()) {
//                MultipartFile file = multiRequest.getFile(ite.next());
//                if (!Objects.isNull(file)) {
//                    String fileName = file.getOriginalFilename();
//                    String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
//                    String uploadPath = request.getServletContext().getRealPath("/") + SystemConfig.UPLOAD_PATH;
//                    String finallyFileName = UUIDUtils.generate() + "." + suffix;
//                    File localFile = new File(uploadPath, finallyFileName);
//                    if (!localFile.exists()) {
//                        localFile.mkdirs();
//                    }
//                    try {
//                        file.transferTo(localFile);
//                        return finallyFileName;
//                    } catch (IOException e) {
//                        Log.error("文件上传异常：{}", e);
//                    }
//                }
//            }
//        }
//        return null;
//    }
//
//    /**
//     * 以classpath为目标读取文件并设置utf-8编码
//     * @param path 文件路径
//     * @return 文件内容
//     */
//    public static String readFileFromClassPath(String path) {
//        URL url = URLUtil.getURL(FileUtil.file(path));
//        File file = FileUtil.file(url);
//        return FileUtil.readUtf8String(file);
//    }
//}
