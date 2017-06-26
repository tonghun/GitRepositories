package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

//@WebFilter("/ServletFilter")
public class ServletFilter implements Filter {

	// private List<String> targets = new ArrayList<String>();

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) request;
		String uri = req.getRequestURI();
		System.out.println("ServletFilter-----uri:" + uri);
		String target = uri.indexOf("?") > 0 ? uri.substring((uri.lastIndexOf("/") + 1), uri.indexOf("?"))
				: uri.substring(uri.lastIndexOf("/") + 1);
		// Servlet的URL中必须含有"Servlet",URL采取格式"/.*Servlet.*"
		if (target.indexOf("Servlet") >= 0) {
			req.getRequestDispatcher(target).forward(req, response);
		} else {
			chain.doFilter(req, response);
		}
	}

	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		// String targets = config.getInitParameter("targets");//
		// this.targets.addAll(Arrays.asList(targets.split(",")));
	}

}