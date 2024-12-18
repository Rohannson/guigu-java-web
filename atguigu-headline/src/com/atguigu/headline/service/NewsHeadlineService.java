package com.atguigu.headline.service;

import com.atguigu.headline.pojo.vo.HeadlineQueryVo;

import java.util.Map;

public interface NewsHeadlineService {
    Map findPage(HeadlineQueryVo headlineQueryVo);
}
