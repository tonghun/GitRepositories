package filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.Filter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharFilter implements Filter {
	protected String encoding = null;
	protected FilterConfig filterConfig = null;

	@Override
	public void destroy() {
		this.encoding = null;
		this.filterConfig = null;

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if (encoding != null) {
			// HttpServletRequest req = (HttpServletRequest) request;
			// String target = req.getRequestURI();// 浏览器请求的地址，即请求指向的URL
			// System.out.println("CharFilter----target:" + target);

			request.setCharacterEncoding(encoding);
			// response.setContentType("text/html; charset=" + encoding);
			System.out.println("the end of CharFilter if");
		}
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = filterConfig;
		this.encoding = filterConfig.getInitParameter("encoding");
	}

}
