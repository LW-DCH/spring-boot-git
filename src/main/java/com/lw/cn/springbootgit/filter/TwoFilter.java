package com.lw.cn.springbootgit.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author: BigTeapot
 * @date: 2021/11/30
 * @description:
 */

@WebFilter(filterName = "twoFilter")
public class TwoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("TwoFilter过滤器init执行");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("TwoFilter过滤器doFilter执行");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("TwoFilter过滤器destroy执行");
    }
}
