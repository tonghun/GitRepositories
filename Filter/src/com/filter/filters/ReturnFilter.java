package com.filter.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 过滤器也可以响应，向页面输出内容
 * 
 * @author tonghuo
 *
 */
@WebFilter("/*")
public class ReturnFilter implements Filter {

	public ReturnFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		chain.doFilter(request, response);
		HttpSession session = req.getSession();
		System.out.println("session=" + session);
		session.setAttribute("name", "Filter_name");

		PrintWriter out = res.getWriter();
		out.write("Filter响应内容");
		return;// return终止当前方法的执行，表示当前方法执行完毕，继续执行后面的方法，不会终止应用程序
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
