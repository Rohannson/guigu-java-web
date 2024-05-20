package com.atguigu.schedule.dao;

import com.atguigu.schedule.pojo.SysUser;

public interface SysUserDao {

    /*
     * increase a user record in user table
     */
    int addSysUser(SysUser sysUser);

    SysUser findByUsername(String username);
}
