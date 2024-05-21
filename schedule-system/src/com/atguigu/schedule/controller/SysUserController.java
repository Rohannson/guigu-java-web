package com.atguigu.schedule.controller;

import com.atguigu.schedule.pojo.SysUser;
import com.atguigu.schedule.service.SysUserService;
import com.atguigu.schedule.service.impl.SysUserServiceImpl;
import com.atguigu.schedule.util.MD5Util;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/user/*")
public class SysUserController extends BaseController {

    private SysUserService userService = new SysUserServiceImpl();

    protected void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("userPwd");
        // Call service level method, and complete registration
            // Put parameters into a SysUser object, pass it in when calling register method
        SysUser sysUser = new SysUser(null, username, password);
        int rows = userService.register(sysUser);
        if (rows > 0) {
            resp.sendRedirect("/registerSuccess.html");
        } else {
            resp.sendRedirect("/registerFail.html");
        }
    }

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");

        SysUser loginUser = userService.findByUsername(username);
        if (null == loginUser) {
            resp.sendRedirect("/loginUsernameError.html");
        } else if (!MD5Util.encrypt(userPwd).equals(loginUser.getUserPwd())){
            resp.sendRedirect("/loginPwdError.html");
        } else {
            // 登陆成功以后,将登陆的用户信息放入Session
            HttpSession session = req.getSession();
            session.setAttribute("sysUser", loginUser);

            resp.sendRedirect("/showSchedule.html");
        }
    }
}
