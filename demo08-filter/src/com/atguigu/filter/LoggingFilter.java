package com.atguigu.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.LogRecord;

public class LoggingFilter implements Filter {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 请求到达目标资源之前的代码
//        System.out.println("logging Filter before doFilter invoked");

        // 参数父转子
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // 请求到达资源之前打印日志 yyyy-mm-dd
        String requestURI = request.getRequestURI();
        String dateTime = dateFormat.format(new Date());
        String beforeLogging = requestURI + " at " + dateTime + " accessed.";
        System.out.println(beforeLogging);

        long t1 = System.currentTimeMillis();

        // 放行代码
        filterChain.doFilter(servletRequest,servletResponse);

        long t2 = System.currentTimeMillis();

        // 响应之后的字符串
        String afterLogging = requestURI + " resource at " + dateTime + "'s request consumed " + (t2 - t1) + " milli seconds.";
        System.out.println(afterLogging);
        // 相应之前的功能代码
//        System.out.println("logging Filter after doFilter invoked");
    }
}
