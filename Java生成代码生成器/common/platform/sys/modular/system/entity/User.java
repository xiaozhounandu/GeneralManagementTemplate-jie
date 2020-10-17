package com.common.platform.sys.modular.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.common.platform.sys.base.pojo.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2020-10-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sys_user")
public class User extends BaseEntity<User> {

    private static final long serialVersionUID=1L;

    /**
     * 主键id
     */
    @TableId("user_id")
    private Long userId;

    /**
     * 头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 账号
     */
    @TableField("account")
    private String account;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * md5密码盐
     */
    @TableField("salt")
    private String salt;

    /**
     * 名字
     */
    @TableField("name")
    private String name;

    /**
     * 生日
     */
    @TableField("birthday")
    private LocalDateTime birthday;

    /**
     * 性别(字典)
     */
    @TableField("sex")
    private String sex;

    /**
     * 电子邮件
     */
    @TableField("email")
    private String email;

    /**
     * 电话
     */
    @TableField("phone")
    private String phone;

    /**
     * 角色id(多个逗号隔开)
     */
    @TableField("role_id")
    private String roleId;

    /**
     * 部门id(多个逗号隔开)
     */
    @TableField("dept_id")
    private Long deptId;

    /**
     * 状态(字典)
     */
    @TableField("status")
    private String status;

    /**
     * 乐观锁
     */
    @TableField("version")
    private Integer version;


    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}
