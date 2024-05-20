package com.atguigu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        String info = "YES";
        if ("atguigu".equals(username)){
            info = "<h1>NO</h1>";
        }

        // 应该设置Content-Type响应头
        response.setHeader("Content-Type", "text/html");

        PrintWriter writer = response.getWriter();
        writer.write(info);
    }
}
