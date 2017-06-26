package servlet;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

public class DirectoryUtils {

	/**
	 * ͨ�����·����ȡ��Ӳ���еľ��Դ���·����
	 * 
	 * @param request
	 * @param relativePath
	 * @return
	 */
	public static String getLocalPath(ServletRequest request, String relativePath) {
		HttpServletRequest req = (HttpServletRequest) request;
		String contextPath = req.getContextPath();
		// contextPath = contextPath.substring(1);
		contextPath = contextPath.replace("/", "\\");// "/"��"\"��������Ϊ·���ָ�����ָ�ǰ������Ŀ¼�������ǲ�ͬ���ַ�������ȡ�
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
