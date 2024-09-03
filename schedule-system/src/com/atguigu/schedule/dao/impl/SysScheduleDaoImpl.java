package com.atguigu.schedule.dao.impl;

import com.atguigu.schedule.dao.SysScheduleDao;
import com.atguigu.schedule.pojo.SysSchedule;
import com.atguigu.schedule.dao.BaseDao;

import java.util.List;

/**
 * This is a practice project, the class is created for practicing DAO layer.
 */
public class SysScheduleDaoImpl extends BaseDao implements SysScheduleDao {

    @Override
    public int addSchedule(SysSchedule schedule) {
        String sql = "insert into sys_schedule values(DEFAULT,?,?,?)";
        int rows = baseUpdate(sql, schedule.getUid(), schedule.getTitle(), schedule.getCompleted());
        return rows;
    }

    @Override
    public List<SysSchedule> findAll() {
        String sql = "select sid, uid, title, completed from sys_schedule";
        List<SysSchedule> sysScheduleList = baseQuery(SysSchedule.class, sql);
        return sysScheduleList;
    }

    @Override
    public Integer removeSchedule(int sid) {
        String sql = "delete from sys_schedule where sid = ?";
        return baseUpdate(sql, sid);
    }
}
