package com.atguigu.headline.controller;

import com.atguigu.headline.common.Result;
import com.atguigu.headline.pojo.NewsType;
import com.atguigu.headline.pojo.vo.HeadlineQueryVo;
import com.atguigu.headline.service.NewsHeadlineService;
import com.atguigu.headline.service.NewsTypeService;
import com.atguigu.headline.service.NewsUserService;
import com.atguigu.headline.service.impl.NewsHeadlineServiceImpl;
import com.atguigu.headline.service.impl.NewsTypeServiceImpl;
import com.atguigu.headline.util.WebUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/portal/*")
public class PortalController extends BaseController{

    private NewsHeadlineService newsHeadlineService = new NewsHeadlineServiceImpl();
    private NewsTypeService typeService = new NewsTypeServiceImpl();

    /*
    * 查询所有头条类型的业务接口实现
    * */

    protected void findAllTypes(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<NewsType> newsTypeList = typeService.findAll();

        WebUtil.writeJson(resp, Result.ok(newsTypeList));
    }

    /*
    * 分页查询头条接口的实现
    *
    * pageData:[
    *   {
    *       "hid":"1",                     // 新闻id
            "title":"尚硅谷宣布 ... ...",   // 新闻标题
            "type":"1",                    // 新闻所属类别编号
            "pageViews":"40",              // 新闻浏览量
            "pastHours":"3" ,              // 发布时间已过小时数
            "publisher":"1"
    *   }
    * ],
    * pageNum:1,
    * pageSize:1,
    * totalPage:1,
    * totalSize:1
    *
    * */
    protected void findNewsPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收请求中的参数
        HeadlineQueryVo headlineQueryVo = WebUtil.readJson(req, HeadlineQueryVo.class);

        // 将参数传递给服务层进行分页查询
        Map pageInfo = newsHeadlineService.findPage(headlineQueryVo);
        Map data = new HashMap();
        data.put("pageInfo", pageInfo);

        // 将分页查询的结构转换成Json响应给客户端
        WebUtil.writeJson(resp, Result.ok(data));
    }
}
