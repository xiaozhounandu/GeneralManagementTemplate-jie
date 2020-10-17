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
@TableName("sys_user_pos")
public class UserPos extends BaseEntity<UserPos> {

    private static final long serialVersionUID=1L;

    /**
     * 主键id
     */
    @TableId("user_pos_id")
    private Long userPosId;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 职位id
     */
    @TableField("pos_id")
    private Long posId;


    @Override
    protected Serializable pkVal() {
        return this.userPosId;
    }

}
