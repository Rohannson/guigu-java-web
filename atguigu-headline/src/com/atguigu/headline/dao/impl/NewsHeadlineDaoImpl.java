package com.atguigu.headline.dao.impl;

import com.atguigu.headline.dao.BaseDao;
import com.atguigu.headline.dao.NewsHeadlinDao;
import com.atguigu.headline.pojo.vo.HeadlinePageVo;
import com.atguigu.headline.pojo.vo.HeadlineQueryVo;

import java.util.List;

public class NewsHeadlineDaoImpl extends BaseDao implements NewsHeadlinDao {
    @Override
    public List<HeadlinePageVo> findPageList(HeadlineQueryVo headlineQueryVo) {
        String sql = """
                select 
                    hid,
                    title,
                    page_views pageViews,
                    TIMESTAMPDIFF(HOUR,create_time,now()) pastHours,
                    publisher
                from
                    news_headline
                where
                    is_deleted = 0
                """;
        if (headlineQueryVo.getType() != 0) {
            sql = sql.concat(" and type = ? ");
        }

        if (headlineQueryVo.getKeyWords() != null && !headlineQueryVo.getKeyWords().equals("")) {

        }

        return null;
    }

    @Override
    public int findPageSize(HeadlineQueryVo headlineQueryVo) {
        return 0;
    }
}
