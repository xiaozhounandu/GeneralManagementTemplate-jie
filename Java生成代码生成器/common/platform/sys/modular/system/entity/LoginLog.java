package com.common.platform.sys.modular.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.common.platform.sys.base.pojo.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("sys_login_log")
public class LoginLog extends BaseEntity<LoginLog> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId("login_log_id")
    private Long loginLogId;

    /**
     * 日志名称
     */
    @TableField("log_name")
    private String logName;

    /**
     * 管理员id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 是否执行成功(字典)
     */
    @TableField("suceed")
    private String suceed;

    /**
     * 具体消息
     */
    @TableField("message")
    private String message;

    /**
     * 登录ip
     */
    @TableField("ip_address")
    private String ipAddress;


    @Override
    protected Serializable pkVal() {
        return this.loginLogId;
    }

}
