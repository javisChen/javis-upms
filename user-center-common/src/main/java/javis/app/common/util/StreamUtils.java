package javis.app.common.util;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Javis
 * @desc 流工具类
 * @date 2017-11-14
 * @time 上午12:24
 */
public class StreamUtils {

	/**
	 * 输出流
	 * @param bytes 输出内容字节数组
	 * @param os 输出流对象
	 */
	public static void write(byte[] bytes, OutputStream os) throws IOException {
		IOUtils.write(bytes, os);
	}
}