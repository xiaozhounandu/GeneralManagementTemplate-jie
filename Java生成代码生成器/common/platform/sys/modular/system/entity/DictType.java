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
@TableName("sys_dict_type")
public class DictType extends BaseEntity<DictType> {

    private static final long serialVersionUID=1L;

    /**
     * 字典类型id
     */
    @TableId("dict_type_id")
    private Long dictTypeId;

    /**
     * 字典类型编码
     */
    @TableField("code")
    private String code;

    /**
     * 字典类型名称
     */
    @TableField("name")
    private String name;

    /**
     * 字典描述
     */
    @TableField("description")
    private String description;

    /**
     * 是否是系统字典，Y-是，N-否
     */
    @TableField("system_flag")
    private String systemFlag;

    /**
     * 状态(字典)
     */
    @TableField("status")
    private String status;

    /**
     * 排序
     */
    @TableField("sort")
    private Integer sort;


    @Override
    protected Serializable pkVal() {
        return this.dictTypeId;
    }

}
