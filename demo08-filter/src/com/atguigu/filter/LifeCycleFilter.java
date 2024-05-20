package com.atguigu.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class LifeCycleFilter implements Filter {

    public LifeCycleFilter() {
        System.out.println("Constructor");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Initiate");
        System.out.println(filterConfig.getInitParameter("dateTimePattern"));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter method");

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("destroy method");
    }
}
