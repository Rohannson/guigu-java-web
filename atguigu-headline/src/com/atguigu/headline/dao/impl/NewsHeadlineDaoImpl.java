package com.atguigu.headline.dao.impl;

import com.atguigu.headline.dao.NewsHeadlinDao;
import com.atguigu.headline.pojo.vo.HeadlinePageVo;
import com.atguigu.headline.pojo.vo.HeadlineQueryVo;

import java.util.List;

public class NewsHeadlineDaoImpl implements NewsHeadlinDao {
    @Override
    public List<HeadlinePageVo> findPageList(HeadlineQueryVo headlineQueryVo) {
        return List.of();
    }

    @Override
    public int findPageSize(HeadlineQueryVo headlineQueryVo) {
        return 0;
    }
}
