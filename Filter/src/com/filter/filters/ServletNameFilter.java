package com.filter.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(value = "/*")
public class ServletNameFilter implements Filter {

	public ServletNameFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("过滤请求");
		chain.doFilter(request, response);
		System.out.println("过滤响应");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
