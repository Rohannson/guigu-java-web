package com.atguigu.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class Filter1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter1 before doFilter invoked");

        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("Filter1 after doFilter invoked");
    }
}
