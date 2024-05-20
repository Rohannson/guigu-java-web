package com.atguigu.schedule.service;

import com.atguigu.schedule.pojo.SysUser;

public interface SysUserService {
    /*
     * For user registration
     * @param sysUser: Username and plain text password represented in object sysUser
     * @return: Registration success returns 1 else return 0
     */
    int register(SysUser sysUser);

    /*
     * Acquire user information by username
     */
    SysUser findByUsername(String username);
}
