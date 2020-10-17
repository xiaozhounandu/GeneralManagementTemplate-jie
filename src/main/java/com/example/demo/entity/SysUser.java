package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SysUser {
    private Long id;
    private String userName;
    private String passWord;
    private Date createTime;
    private Integer userAge;
    private String remark;


    public void setCreateTime(Date date) {
    }
}
