package com.atguigu.headline.controller;

import com.atguigu.headline.common.Result;
import com.atguigu.headline.pojo.NewsType;
import com.atguigu.headline.service.NewsTypeService;
import com.atguigu.headline.service.impl.NewsTypeServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/portal/*")
public class PortalController extends BaseController{
    private NewsTypeService typeService = new NewsTypeServiceImpl();

    /*
    * 查询所有头条类型的业务接口实现
    * */

    protected void findAllType(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<NewsType> newsTypeList = typeService.findAll();

        Result.ok(newsTypeList);
    }
}
