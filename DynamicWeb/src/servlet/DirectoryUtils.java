package servlet;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

public class DirectoryUtils {

	/**
	 * 通过相对路径获取在硬盘中的绝对创建路径；
	 * 
	 * @param request
	 * @param relativePath
	 * @return
	 */
	public static String getLocalPath(ServletRequest request, String relativePath) {
		HttpServletRequest req = (HttpServletRequest) request;
		String contextPath = req.getContextPath();
		// contextPath = contextPath.substring(1);
		contextPath = contextPath.replace("/", "\\");// "/"与"\"都可以作为路径分割符，分割前后两个目录，两者是不同的字符，不相等。
		// System.out.println("DirectoryUtils----contextPath:" + contextPath);

		String realPath = req.getServletContext().getRealPath(relativePath);
		// System.out.println("DirectoryUtils----realPath:" + realPath);

		realPath = realPath.replace(
				"\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps" + contextPath,
				contextPath + "\\WebContent");
		// int index=realPath.indexOf(contextPath);
		// String filePath=realPath.replace(context, replacement)
		return realPath;
	}

}
