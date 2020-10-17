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
@TableName("sys_operation_log")
public class OperationLog extends BaseEntity<OperationLog> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId("operation_log_id")
    private Long operationLogId;

    /**
     * 日志类型(字典)
     */
    @TableField("log_type")
    private String logType;

    /**
     * 日志名称
     */
    @TableField("log_name")
    private String logName;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 类名称
     */
    @TableField("class_name")
    private String className;

    /**
     * 方法名称
     */
    @TableField("method")
    private String method;

    /**
     * 是否成功(字典)
     */
    @TableField("succeed")
    private String succeed;

    /**
     * 备注
     */
    @TableField("message")
    private String message;


    @Override
    protected Serializable pkVal() {
        return this.operationLogId;
    }

}
