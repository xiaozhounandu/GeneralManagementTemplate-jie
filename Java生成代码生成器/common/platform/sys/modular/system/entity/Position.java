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
@TableName("sys_position")
public class Position extends BaseEntity<Position> {

    private static final long serialVersionUID=1L;

    /**
     * 主键id
     */
    @TableId("position_id")
    private Long positionId;

    /**
     * 职位名称
     */
    @TableField("name")
    private String name;

    /**
     * 职位编码
     */
    @TableField("code")
    private String code;

    /**
     * 顺序
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 状态(字典)
     */
    @TableField("status")
    private String status;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;


    @Override
    protected Serializable pkVal() {
        return this.positionId;
    }

}
