package com.atguigu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servlet04")
public class Servlet04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getMethod());
        System.out.println(req.getScheme());
        System.out.println(req.getProtocol());
        System.out.println(req.getRequestURI());
        System.out.println(req.getRequestURL());
    }
}
