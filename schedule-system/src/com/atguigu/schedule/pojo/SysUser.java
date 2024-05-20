package com.atguigu.schedule.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;
@AllArgsConstructor // 添加了全参构造器
@NoArgsConstructor
@Data
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;

}
