package com.atguigu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/servlet06")
public class Servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String info =  "<h1>hello</h1>";
        resp.setStatus(200);
        resp.setContentType("text/html");
        resp.setContentLength(info.getBytes().length);

        PrintWriter writer = resp.getWriter();
        writer.write(info);
    }
}
