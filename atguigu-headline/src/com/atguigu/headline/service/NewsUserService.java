package com.atguigu.headline.service;

import com.atguigu.headline.pojo.NewsUser;

public interface NewsUserService {

    /*
    * 根据用户登录的账号, 找用户新的方法
    * @param: username 用户输入账号
    * @return: 找到返回NewsUser对象, 找不到返回null
    * */

    NewsUser findByUsername(String username);

    /*
    *
    * */
    NewsUser findByUid(Integer userId);

    Integer registUser(NewsUser registUser);
}
