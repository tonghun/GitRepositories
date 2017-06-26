package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class CounterFilter implements Filter {
	private int count;

	public CounterFilter() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("CountFilter执行");
		count++;
		HttpServletRequest req = (HttpServletRequest) request;
		// ServletContext context = req.getSession().getServletContext();
		// context.setAttribute("count", count);
		// context.setAttribute("count", count);
		HttpSession session = req.getSession();
		session.setAttribute("count", count);

		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException, NumberFormatException {
		// TODO Auto-generated method stub
		String param = fConfig.getInitParameter("count");
		if (param != null) {
			count = Integer.parseInt(param);
			// System.out.println(count);
		} else {
			// System.out.println("param为空");
			return;
		}
		// System.out.println("param不为空");

	}

}
