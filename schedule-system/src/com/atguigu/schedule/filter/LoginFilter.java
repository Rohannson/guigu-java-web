package com.atguigu.schedule.filter;

import com.atguigu.schedule.pojo.SysUser;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = {"/showSchedule.html", "/schedule/*"})
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // 获得session 对象
        HttpSession session = request.getSession();

        // 从session域中获取登陆的用户对象
        Object sysUser = (SysUser)session.getAttribute("sysUser");

        // 判断用户对象是否为空
        if(sysUser != null) {
            //每登陆跳转道login.html
            response.sendRedirect("/login.html");
        } else {
            // 登陆过放行
            filterChain.doFilter(request,response);
        }

    }
}
