package com.atguigu.headline.dao;

import com.atguigu.headline.pojo.vo.HeadlinePageVo;
import com.atguigu.headline.pojo.vo.HeadlineQueryVo;

import java.util.List;

public interface NewsHeadlinDao {
    List<HeadlinePageVo> findPageList(HeadlineQueryVo headlineQueryVo);

    int findPageSize(HeadlineQueryVo headlineQueryVo);
}

