package com.atguigu.schedule.service.impl;

import com.atguigu.schedule.dao.SysScheduleDao;
import com.atguigu.schedule.dao.impl.SysScheduleDaoImpl;
import com.atguigu.schedule.service.SysScheduleService;

public class SysScheduleServiceImpl implements SysScheduleService {
    SysScheduleDao sysScheduleDao = new SysScheduleDaoImpl();
    @Override
    public Integer removeSchedule(int sid) {
        return sysScheduleDao.removeSchedule(sid);
    }
}
